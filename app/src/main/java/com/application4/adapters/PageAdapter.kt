package com.application4.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application4.ui.fragments.MyContactsFragment
import com.application4.ui.fragments.MyProfileFragment

class PageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MyProfileFragment()
            else -> MyContactsFragment()
        }
    }
}