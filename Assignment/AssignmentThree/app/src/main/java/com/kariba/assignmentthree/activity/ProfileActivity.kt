package com.kariba.assignmentthree.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kariba.assignmentthree.R
import com.kariba.assignmentthree.preference.AppPreference
import com.kariba.assignmentthree.preference.AppPreferenceImpl
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    private lateinit var appPreference: AppPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        getValueFromSharedPreference()
    }

    private fun getValueFromSharedPreference() {
        appPreference = AppPreferenceImpl(this)

        textView_name_value.text = appPreference.getString(AppPreference.NAME) ?: ""
        textView_phoneNumberValue.text = appPreference.getString(AppPreference.PHONE_NUMBER) ?: ""
        textView_email_value.text = appPreference.getString(AppPreference.EMAIL_ADDRESS) ?: ""
    }
}