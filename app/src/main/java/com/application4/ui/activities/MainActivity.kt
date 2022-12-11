package com.application4.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.application4.R
import com.application4.utils.Constants

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saveAuthUsername()
    }

    private fun saveAuthUsername() {
        getPreferences(MODE_PRIVATE).edit()
            .apply {
                putString(
                    Constants.AUTH_STRING_KEY,
                    intent.getStringExtra(Constants.EXTRA_EMAIL_KEY) ?: ""
                )
            }
            .apply()
    }
}