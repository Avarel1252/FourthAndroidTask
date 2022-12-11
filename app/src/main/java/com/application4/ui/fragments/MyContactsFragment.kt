package com.application4.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.application4.databinding.FragmentMyContactsBinding
import com.application4.models.UserModel
import com.application4.models.UserViewModel
import com.application4.adapters.UserAdapter
import com.application4.utils.Constants
import com.application4.utils.IUserAdapterListener


class MyContactsFragment : Fragment() {

    private lateinit var binding: FragmentMyContactsBinding
    private val sharedViewModel: UserViewModel by activityViewModels()
    private val userAdapter by lazy {
        UserAdapter(object : IUserAdapterListener {
            override fun deleteItem(user: UserModel) {
                sharedViewModel.deleteUser(user)
            }

            override fun getSelectItemId(user: UserModel) {
                findNavController().navigate(
                    ViewPagerFragmentDirections.actionViewPagerFragmentToDetailViewFragment(user)
                )
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyContactsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rwUsers.adapter = userAdapter
            tvAddContacts.setOnClickListener {
                findNavController().navigate(
                    ViewPagerFragmentDirections.actionViewPagerFragmentToAddContactFragment()
                )
            }
        }
        setObserver()
    }


    private fun setObserver() {
        sharedViewModel.userLiveData.observe(viewLifecycleOwner) {
            userAdapter.submitList(it)
        }
    }

}