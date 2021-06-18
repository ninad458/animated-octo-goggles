package com.enigma.githubpulls.features.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.enigma.githubpulls.R
import com.enigma.githubpulls.features.lists.pull.PullAdapter

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    private val pullAdapter = PullAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<RecyclerView>(R.id.list)
        listView.adapter = pullAdapter
        viewModel.fetchPulls()
        val progress = findViewById<View>(R.id.progressBar)
        progress.visibility = View.VISIBLE
        listView.visibility = View.GONE

        viewModel.pulls.observe(this, { pulls ->
            pullAdapter.setData(pulls)
        })

        viewModel.loading.observe(this, { loading ->
            if (loading) {
                progress.visibility = View.VISIBLE
                listView.visibility = View.GONE
            } else {
                progress.visibility = View.GONE
                listView.visibility = View.VISIBLE
            }
        })
    }
}