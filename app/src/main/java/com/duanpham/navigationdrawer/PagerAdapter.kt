package com.duanpham.navigationdrawer

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                InboxFragment()
            }
            1 -> SnoozedFragment()
            2 -> DoneFragment()
            3 -> DraftFragment()
            else -> {
                SentFragment()
            }
            // this method to set our tab positions
        }


    }

    // return 5 tabs
    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Inbox"
            1 -> "Snoozed"
            2 -> "Done"
            3 -> "Draft"
            else -> {
                return "Sent"
            }
        }
    }
}