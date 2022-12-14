package com.application4.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.application4.databinding.FragmentDetailViewBinding
import com.application4.models.UserModel
import com.application4.utils.extensions.setImage

class DetailViewFragment : Fragment() {
    private lateinit var binding: FragmentDetailViewBinding
    private val args by navArgs<DetailViewFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.imgBtnBack.setOnClickListener { findNavController().popBackStack() }
        (args.targetUser).let {
            with(binding) {
                ivAccPhoto.setImage(it)
                tvUsername.text = it.username
                tvCareer.text = it.career
                tvAddress.text = it.homeAddress
            }
        }
    }
}
