package com.enigma.githubpulls.model.pull

import com.enigma.githubpulls.model.user.User
import java.util.*

data class Pull(
    val id: Long,
    val title: String,
    val createdAt: Date,
    val closedDate: Date,
    val user: User
)