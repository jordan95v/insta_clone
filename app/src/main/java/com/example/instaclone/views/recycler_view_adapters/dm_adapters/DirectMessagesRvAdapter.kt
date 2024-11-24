package com.example.instaclone.views.recycler_view_adapters.dm_adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.R
import com.example.instaclone.data.model.messages.Message
import com.example.instaclone.views.viewholders.dm_vh.DirectMessageViewHolder

class DirectMessagesRvAdapter(var messages: List<Message>): RecyclerView.Adapter<DirectMessageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectMessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.direct_message_rv_cell, parent, false)
        return DirectMessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: DirectMessageViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10 //messages.size
    }
}