package com.enigma.githubpulls.features.lists.pull

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.enigma.githubpulls.R
import com.enigma.githubpulls.model.pull.Pull
import java.text.SimpleDateFormat
import java.util.*

class PullViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val dateFormat: SimpleDateFormat =
        SimpleDateFormat("dd/MMM/yyyy hh:mm:s", Locale.getDefault())

    fun bindData(pull: Pull) {
        itemView.apply {
            findViewById<TextView>(R.id.txt_title).text = pull.title
            findViewById<TextView>(R.id.txt_created_at).text = dateFormat.format(pull.createdAt)
            findViewById<TextView>(R.id.txt_closed_at).text = dateFormat.format(pull.closedDate)
            findViewById<TextView>(R.id.txt_user_name).text = pull.user.userName
            Glide.with(itemView).load(pull.user.userIcon).into(findViewById(R.id.img_user_icon))
        }
    }
}