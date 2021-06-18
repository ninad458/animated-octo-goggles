package com.enigma.githubpulls.features.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enigma.githubpulls.data.remote.GithubService
import com.enigma.githubpulls.data.remote.resp.PullRes
import com.enigma.githubpulls.model.pull.Pull
import com.enigma.githubpulls.model.pull.mapper.PullMapper
import com.enigma.githubpulls.utils.asLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class MainViewModel : ViewModel() {

    private val pullMapper: PullMapper =
        PullMapper(SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()))

    private val githubService: GithubService = GithubService.getInstance()

    private val _loading = MutableLiveData<Boolean>()

    val loading get() = _loading.asLiveData()

    private val _pulls = MutableLiveData<List<Pull>>()

    val pulls get() = _pulls.asLiveData()

    fun fetchPulls() {
        githubService.getPullRequests().enqueue(object : Callback<List<PullRes>> {
            override fun onResponse(call: Call<List<PullRes>>, response: Response<List<PullRes>>) {
                _loading.postValue(false)
                val body = response.body()
                if (response.isSuccessful && body != null) {
                    val pullRequests = body.mapNotNull(pullMapper::mapToUI)
                    _pulls.postValue(pullRequests)
                }
            }

            override fun onFailure(call: Call<List<PullRes>>, t: Throwable) {
                _loading.postValue(false)
            }
        })
    }
}