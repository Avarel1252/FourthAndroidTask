package com.application4.utils

import android.graphics.Color

object Constants {
    //keys shPref, bundle, extra
    //activity auth
    const val SHARED_PREF_EMAIL_KEY = "remembered_email"
    const val SHARED_PREF_PASSWORD_KEY = "remembered_email"
    const val EMAIL_BUNDLE_KEY = "email"
    const val PASSWORD_BUNDLE_KEY = "password"
    const val EXTRA_EMAIL_KEY = "extra_email"

    //activity main
    const val AUTH_STRING_KEY = "authString"

    //const values for customView (googleBtn)
    //dimensions in dp|sp
    const val DEFAULT_TEXT_SIZE = 14f
    const val DEFAULT_TEXT_COLOR = Color.BLACK
    const val DEFAULT_TEXT = "GOOGLE"

    const val DEFAULT_BOX_BUTTON_COLOR = Color.WHITE
    const val DEFAULT_CORNER_RADIUS = 10f
    const val DEFAULT_ICON_GAP = 6f

    const val DEFAULT_INNER_PADDING = 16f

    //addContactFragment
    const val DEFAULT_USER_PHOTO =
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdoikUA-Hjh54hb_aaAY9sBwE9h4cUneajPg&usqp=CAU"
    const val DIALOG_TAG = "ADD_CONTACT_DIALOG"
}