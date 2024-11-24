package com.example.instaclone.views.recycler_view_adapters.home_adapters

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.R
import com.example.instaclone.data.model.posts.Post
import com.example.instaclone.views.viewholders.home_vh.PostsRvViewHolder

class PostsRvAdapter(val posts: List<Post>): RecyclerView.Adapter<PostsRvViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsRvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_posts_view_holder, parent, false)

        return PostsRvViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10 //posts.size
    }

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: PostsRvViewHolder, position: Int) {

    }
}