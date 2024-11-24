package com.example.instaclone.views.recycler_view_adapters.home_adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.R
import com.example.instaclone.data.model.story.Story
import com.example.instaclone.pages.interfaces.StoryClickHandler
import com.example.instaclone.views.viewholders.home_vh.StoryViewHolder

class StoryRvAdapter(private val stories: List<Story>,
                     private val storyClickHandler: StoryClickHandler): RecyclerView.Adapter<StoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_story_view_holder, parent, false)

        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        if (position == 0) {
            holder.userAddStoryImageView.visibility = View.VISIBLE
            holder.userAddStoryImageView.setOnClickListener {
                this.storyClickHandler.addStory()
            }

        } else {
            holder.userAddStoryImageView.visibility = View.GONE
        }

    }
}