package com.enigma.githubpulls.data.remote.resp

import com.google.gson.annotations.SerializedName

data class PullRes(
    val url: String?,
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    @SerializedName("diff_url")
    val diffURL: String?,

    @SerializedName("patch_url")
    val patchURL: String?,

    @SerializedName("issue_url")
    val issueURL: String?,

    val number: Long?,
    val state: String?,
    val locked: Boolean?,
    val title: String?,
    val user: User?,
    val body: String?,

    @SerializedName("created_at")
    val createdAt: String?,

    @SerializedName("updated_at")
    val updatedAt: String?,

    @SerializedName("closed_at")
    val closedAt: String?,

    @SerializedName("merged_at")
    val mergedAt: String?,

    @SerializedName("merge_commit_sha")
    val mergeCommitSHA: String?,

    val assignee: Assignee? = null,
    val assignees: List<Assignee?>?,

    @SerializedName("requested_reviewers")
    val requestedReviewers: List<Assignee?>?,

    @SerializedName("requested_teams")
    val requestedTeams: List<Team?>?,

    val labels: List<Label>?,
    val milestone: MileStone? = null,
    val draft: Boolean?,

    @SerializedName("commits_url")
    val commitsURL: String?,

    @SerializedName("review_comments_url")
    val reviewCommentsURL: String?,

    @SerializedName("review_comment_url")
    val reviewCommentURL: String?,

    @SerializedName("comments_url")
    val commentsURL: String?,

    @SerializedName("statuses_url")
    val statusesURL: String?,

    val head: Base?,
    val base: Base?,

    @SerializedName("_links")
    val links: Links?,

    @SerializedName("author_association")
    val authorAssociation: String?,

    @SerializedName("active_lock_reason")
    val activeLockReason: String? = null
)

data class MileStone(
    val url: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    @SerializedName("labels_url")
    val labelsURL: String?,

    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    val number: Long?,
    val state: String?,
    val title: String?,
    val description: String?,
    val creator: Creator?,

    @SerializedName("open_issues")
    val openIssues: Long?,

    @SerializedName("closed_issues")
    val closedIssues: Long?,

    @SerializedName("created_at")
    val createdAt: String?,

    @SerializedName("updated_at")
    val updatedAt: String?,

    @SerializedName("closed_at")
    val closedAt: String?,

    @SerializedName("due_on")
    val dueOn: String?
)

data class Creator(
    val login: String?,
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    @SerializedName("avatar_url")
    val avatarURL: String?,

    @SerializedName("gravatar_id")
    val gravatarID: String?,

    val url: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    @SerializedName("followers_url")
    val followersURL: String?,

    @SerializedName("following_url")
    val followingURL: String?,

    @SerializedName("gists_url")
    val gistsURL: String?,

    @SerializedName("starred_url")
    val starredURL: String?,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String?,

    @SerializedName("organizations_url")
    val organizationsURL: String?,

    @SerializedName("repos_url")
    val reposURL: String?,

    @SerializedName("events_url")
    val eventsURL: String?,

    @SerializedName("received_events_url")
    val receivedEventsURL: String?,

    val type: String?,

    @SerializedName("site_admin")
    val siteAdmin: Boolean?
)

data class Team(
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    val url: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    val name: String?,
    val slug: String?,
    val description: String?,
    val privacy: String?,
    val permission: String?,

    @SerializedName("members_url")
    val membersURL: String?,

    @SerializedName("repositories_url")
    val repositoriesURL: String?
)

data class Assignee(
    val login: String?,
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    @SerializedName("avatar_url")
    val avatarURL: String?,

    @SerializedName("gravatar_id")
    val gravatarID: String?,

    val url: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    @SerializedName("followers_url")
    val followersURL: String?,

    @SerializedName("following_url")
    val followingURL: String?,

    @SerializedName("gists_url")
    val gistsURL: String?,

    @SerializedName("starred_url")
    val starredURL: String?,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String?,

    @SerializedName("organizations_url")
    val organizationsURL: String?,

    @SerializedName("repos_url")
    val reposURL: String?,

    @SerializedName("events_url")
    val eventsURL: String?,

    @SerializedName("received_events_url")
    val receivedEventsURL: String?,

    val type: String?,

    @SerializedName("site_admin")
    val siteAdmin: Boolean?
)

data class Base(
    val label: String?,
    val ref: String?,
    val sha: String?,
    val user: User?,
    val repo: Repo?
)

data class Repo(
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    val name: String?,

    @SerializedName("full_name")
    val fullName: String?,

    val private: Boolean?,
    val owner: User?,

    @SerializedName("html_url")
    val htmlURL: String?,

    val description: String? = null,
    val fork: Boolean?,
    val url: String?,

    @SerializedName("forks_url")
    val forksURL: String?,

    @SerializedName("keys_url")
    val keysURL: String?,

    @SerializedName("collaborators_url")
    val collaboratorsURL: String?,

    @SerializedName("teams_url")
    val teamsURL: String?,

    @SerializedName("hooks_url")
    val hooksURL: String?,

    @SerializedName("issue_events_url")
    val issueEventsURL: String?,

    @SerializedName("events_url")
    val eventsURL: String?,

    @SerializedName("assignees_url")
    val assigneesURL: String?,

    @SerializedName("branches_url")
    val branchesURL: String?,

    @SerializedName("tags_url")
    val tagsURL: String?,

    @SerializedName("blobs_url")
    val blobsURL: String?,

    @SerializedName("git_tags_url")
    val gitTagsURL: String?,

    @SerializedName("git_refs_url")
    val gitRefsURL: String?,

    @SerializedName("trees_url")
    val treesURL: String?,

    @SerializedName("statuses_url")
    val statusesURL: String?,

    @SerializedName("languages_url")
    val languagesURL: String?,

    @SerializedName("stargazers_url")
    val stargazersURL: String?,

    @SerializedName("contributors_url")
    val contributorsURL: String?,

    @SerializedName("subscribers_url")
    val subscribersURL: String?,

    @SerializedName("subscription_url")
    val subscriptionURL: String?,

    @SerializedName("commits_url")
    val commitsURL: String?,

    @SerializedName("git_commits_url")
    val gitCommitsURL: String?,

    @SerializedName("comments_url")
    val commentsURL: String?,

    @SerializedName("issue_comment_url")
    val issueCommentURL: String?,

    @SerializedName("contents_url")
    val contentsURL: String?,

    @SerializedName("compare_url")
    val compareURL: String?,

    @SerializedName("merges_url")
    val mergesURL: String?,

    @SerializedName("archive_url")
    val archiveURL: String?,

    @SerializedName("downloads_url")
    val downloadsURL: String?,

    @SerializedName("issues_url")
    val issuesURL: String?,

    @SerializedName("pulls_url")
    val pullsURL: String?,

    @SerializedName("milestones_url")
    val milestonesURL: String?,

    @SerializedName("notifications_url")
    val notificationsURL: String?,

    @SerializedName("labels_url")
    val labelsURL: String?,

    @SerializedName("releases_url")
    val releasesURL: String?,

    @SerializedName("deployments_url")
    val deploymentsURL: String?,

    @SerializedName("created_at")
    val createdAt: String?,

    @SerializedName("updated_at")
    val updatedAt: String?,

    @SerializedName("pushed_at")
    val pushedAt: String?,

    @SerializedName("git_url")
    val gitURL: String?,

    @SerializedName("ssh_url")
    val sshURL: String?,

    @SerializedName("clone_url")
    val cloneURL: String?,

    @SerializedName("svn_url")
    val svnURL: String?,

    val homepage: String?,
    val size: Long?,

    @SerializedName("stargazers_count")
    val stargazersCount: Long?,

    @SerializedName("watchers_count")
    val watchersCount: Long?,

    val language: String?,

    @SerializedName("has_issues")
    val hasIssues: Boolean?,

    @SerializedName("has_projects")
    val hasProjects: Boolean?,

    @SerializedName("has_downloads")
    val hasDownloads: Boolean?,

    @SerializedName("has_wiki")
    val hasWiki: Boolean?,

    @SerializedName("has_pages")
    val hasPages: Boolean?,

    @SerializedName("forks_count")
    val forksCount: Long?,

    @SerializedName("mirror_url")
    val mirrorURL: String? = null,

    val archived: Boolean?,
    val disabled: Boolean?,

    @SerializedName("open_issues_count")
    val openIssuesCount: Long?,

    val license: License? = null,
    val forks: Long?,

    @SerializedName("open_issues")
    val openIssues: Long?,

    val watchers: Long?,

    @SerializedName("default_branch")
    val defaultBranch: String?
)

data class License(
    val key: String?,
    val name: String?,
    val url: String?,

    @SerializedName("spdx_id")
    val spdxID: String?,
    @SerializedName("node_id")
    val nodeID: String?
)

data class User(
    val login: String?,
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    @SerializedName("avatar_url")
    val avatarURL: String?,

    @SerializedName("gravatar_id")
    val gravatarID: String?,

    val url: String?,

    @SerializedName("html_url")
    val htmlURL: String?,

    @SerializedName("followers_url")
    val followersURL: String?,

    @SerializedName("following_url")
    val followingURL: String?,

    @SerializedName("gists_url")
    val gistsURL: String?,

    @SerializedName("starred_url")
    val starredURL: String?,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String?,

    @SerializedName("organizations_url")
    val organizationsURL: String?,

    @SerializedName("repos_url")
    val reposURL: String?,

    @SerializedName("events_url")
    val eventsURL: String?,

    @SerializedName("received_events_url")
    val receivedEventsURL: String?,

    val type: String?,

    @SerializedName("site_admin")
    val siteAdmin: Boolean?
)

data class Label(
    val id: Long?,

    @SerializedName("node_id")
    val nodeID: String?,

    val url: String?,
    val name: String?,
    val color: String?,
    val default: Boolean?,
    val description: String?
)

data class Links(
    val self: Comments?,
    val html: Comments?,
    val issue: Comments?,
    val comments: Comments?,

    @SerializedName("review_comments")
    val reviewComments: Comments?,

    @SerializedName("review_comment")
    val reviewComment: Comments?,

    val commits: Comments?,
    val statuses: Comments?
)

data class Comments(
    val href: String
)
