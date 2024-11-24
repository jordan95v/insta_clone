package com.example.instaclone.views.viewholders.home_vh

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instaclone.R

class StoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val storyCellLayout: LinearLayout = itemView.findViewById(R.id.story_cell_layout)
    val userprofilePicImageView: ImageView = itemView.findViewById(R.id.user_profile_pic_image_view)
    val usernameTextView: TextView = itemView.findViewById(R.id.story_username_tv)
    val userAddStoryImageView: ImageView = itemView.findViewById(R.id.user_add_story_image_view)

}