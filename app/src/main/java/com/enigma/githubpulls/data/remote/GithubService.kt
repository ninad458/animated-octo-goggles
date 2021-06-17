package com.enigma.githubpulls.data.remote

import com.enigma.githubpulls.data.remote.resp.PullRes
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GithubService {
    @GET("repos/ninad458/animated-octo-goggles/pulls?state=closed")
    suspend fun getPullRequests(): List<PullRes>

    companion object{
        fun getInstance(): GithubService {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(GithubService::class.java)
        }
    }
}