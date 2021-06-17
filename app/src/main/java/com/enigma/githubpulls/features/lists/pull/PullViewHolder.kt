package com.enigma.githubpulls.features.lists.pull

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.enigma.githubpulls.databinding.ItemPullBinding
import com.enigma.githubpulls.model.pull.Pull
import java.text.SimpleDateFormat
import java.util.*

class PullViewHolder(private val binding: ItemPullBinding) : RecyclerView.ViewHolder(binding.root) {
    private val dateFormat: SimpleDateFormat =
        SimpleDateFormat("dd/MMM/yyyy hh:mm:s", Locale.getDefault())

    fun bindData(pull: Pull) {
        binding.apply {
            txtTitle.text = pull.title
            txtCreatedAt.text = dateFormat.format(pull.createdAt)
            txtClosedAt.text = dateFormat.format(pull.closedDate)
            txtUserName.text = pull.user.userName
            Glide.with(itemView).load(pull.user.userIcon).into(imgUserIcon)
        }
    }
}