package com.enigma.githubpulls.features.lists.pull

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enigma.githubpulls.databinding.ItemPullBinding
import com.enigma.githubpulls.model.pull.Pull

class PullAdapter : RecyclerView.Adapter<PullViewHolder>() {

    private var pulls: List<Pull> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PullViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PullViewHolder(ItemPullBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: PullViewHolder, position: Int) {
        holder.bindData(pulls[position])
    }

    fun setData(pulls: List<Pull>) {
        this.pulls = pulls
        notifyDataSetChanged()
    }

    override fun getItemCount() = pulls.size
}