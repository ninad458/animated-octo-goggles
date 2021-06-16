package com.enigma.githubpulls.features.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enigma.githubpulls.data.remote.GithubService
import com.enigma.githubpulls.model.pull.mapper.PullMapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val githubService: GithubService,
    private val pullMapper: PullMapper
) : ViewModel() {

    fun fetchPulls() {
        viewModelScope.launch {
            val pullRequests = try {
                githubService.getPullRequests().map(pullMapper::mapToUI)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            Log.d("xxxxxx", "init : $pullRequests")
        }
    }
}