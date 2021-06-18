package com.enigma.githubpulls.model.pull.mapper

import com.enigma.githubpulls.data.remote.resp.PullRes
import com.enigma.githubpulls.model.pull.Pull
import com.enigma.githubpulls.model.user.User
import java.text.SimpleDateFormat

class PullMapper(private val simpleDateFormat: SimpleDateFormat) {

    fun mapToUI(pullRes: PullRes): Pull? {
        return Pull(
            pullRes.id ?: return null,
            pullRes.title ?: return null,
            simpleDateFormat.parse(pullRes.createdAt ?: return null) ?: return null,
            simpleDateFormat.parse(pullRes.closedAt ?: return null) ?: return null,
            pullRes.user?.run {
                User(
                    id ?: return null,
                    login ?: return null,
                    avatarURL ?: return null
                )
            } ?: return null
        )
    }
}