package com.enigma.githubpulls.features.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.enigma.githubpulls.R
import com.enigma.githubpulls.databinding.ActivityMainBinding
import com.enigma.githubpulls.features.lists.pull.PullAdapter
import com.enigma.githubpulls.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private val pullAdapter = PullAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.list.adapter = pullAdapter
        viewModel.fetchPulls()
        viewModel.pulls.observe(this, { pulls ->
            pullAdapter.setData(pulls)
        })

        viewModel.loading.observe(this, { loading ->
            binding.progressBar.isVisible = loading
            binding.list.isVisible = !loading || binding.list.childCount > 0
        })
    }
}