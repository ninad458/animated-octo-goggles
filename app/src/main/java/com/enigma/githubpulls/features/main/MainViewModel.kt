package com.enigma.githubpulls.features.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enigma.githubpulls.data.remote.GithubService
import com.enigma.githubpulls.model.pull.Pull
import com.enigma.githubpulls.model.pull.mapper.PullMapper
import com.enigma.githubpulls.utils.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val githubService: GithubService,
    private val pullMapper: PullMapper
) : ViewModel() {

    private val _loading = MutableLiveData<Boolean>()

    val loading get() = _loading.asLiveData()

    private val _pulls = MutableLiveData<List<Pull>>()

    val pulls get() = _pulls.asLiveData()

    fun fetchPulls() {
        viewModelScope.launch {
            try {
                _loading.postValue(true)
                val pullRequests = githubService.getPullRequests().mapNotNull(pullMapper::mapToUI)
                _pulls.postValue(pullRequests)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                _loading.postValue(false)
            }
        }
    }
}