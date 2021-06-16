package com.enigma.githubpulls.configuration.di

import com.enigma.githubpulls.data.remote.GithubService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getGithubService() = GithubService.getInstance()

    @Provides
    @Reusable
    fun getDateFormat() = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())

}