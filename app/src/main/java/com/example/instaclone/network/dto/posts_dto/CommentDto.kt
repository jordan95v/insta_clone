package com.example.instaclone.network.dto.posts_dto

data class CommentDto(
    val comment: String,
    val timestamp: String,
    val user_id: String,
    val username: String
)