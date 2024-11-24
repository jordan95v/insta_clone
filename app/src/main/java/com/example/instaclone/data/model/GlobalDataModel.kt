package com.example.instaclone.data.model

import com.example.instaclone.data.model.following.Following
import com.example.instaclone.data.model.messages.Message
import com.example.instaclone.data.model.posts.Post
import com.example.instaclone.data.model.story.Story

data class GlobalDataModel(
    val followings: List<Following>,
    val messages: List<Message>,
    val posts: List<Post>,
    val stories: List<Story>
)