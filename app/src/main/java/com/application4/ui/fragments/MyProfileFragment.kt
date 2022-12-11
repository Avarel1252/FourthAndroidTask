package com.application4.ui.fragments

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.application4.R
import com.application4.databinding.FragmentMyProfileBinding
import com.application4.utils.Constants
import com.application4.utils.ParseData

class MyProfileFragment : Fragment() {

    private lateinit var binding: FragmentMyProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUsernameText()

    }

    private fun setUsernameText() {
        val (name, surname) = ParseData().parseUserName(
            requireActivity().getPreferences(MODE_PRIVATE)
                .getString(Constants.AUTH_STRING_KEY, "")
        )
        binding.tvUsername.text = getString(R.string.userName, name, surname)
    }

}