package com.application4.utils

import com.application4.models.UserModel

interface IUserAdapterListener {
    fun deleteItem(user: UserModel)
    fun getSelectItemId(user: UserModel)
}