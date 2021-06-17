package com.enigma.githubpulls.features.lists.pull

import androidx.recyclerview.widget.RecyclerView
import com.enigma.githubpulls.databinding.ItemPullBinding
import com.enigma.githubpulls.model.pull.Pull

class PullViewHolder(private val binding: ItemPullBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bindData(pull: Pull) {
        binding.textView.text = pull.toString()
    }
}