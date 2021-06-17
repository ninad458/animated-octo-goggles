package com.enigma.githubpulls.features.lists.pull

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enigma.githubpulls.R
import com.enigma.githubpulls.databinding.ItemPullBinding
import com.enigma.githubpulls.model.pull.Pull

class PullViewHolder(parent: View) : RecyclerView.ViewHolder(
    parent
) {
    private val binding = ItemPullBinding.bind(parent)

    fun bindData(pull: Pull) {
        binding.textView.text = pull.toString()
    }
}