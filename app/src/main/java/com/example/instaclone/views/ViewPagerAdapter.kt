package com.example.instaclone.views

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.instaclone.pages.HomeActivity
import com.example.instaclone.pages.interfaces.PagerHandler
import com.example.instaclone.views.pager_fragments.DirectMessagesFragment
import com.example.instaclone.views.pager_fragments.MediaFragments
import com.example.instaclone.views.pager_fragments.UserFeedFragment

class ViewPagerAdapter(activity: HomeActivity, private val pagerHandler: PagerHandler): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        val homePage = UserFeedFragment.newInstance(pagerHandler)
        return when(position) {
            0 -> MediaFragments()
            1 -> homePage
            2 -> DirectMessagesFragment()
            else -> homePage
        }
    }


}