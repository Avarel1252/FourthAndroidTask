package com.application4.utils

import androidx.recyclerview.widget.DiffUtil
import com.application4.models.UserModel

object ItemCallbackDiffUtil : DiffUtil.ItemCallback<UserModel>() {
    override fun areItemsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
        return oldItem == newItem
    }
}
