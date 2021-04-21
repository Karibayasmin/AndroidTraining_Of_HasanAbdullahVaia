package com.elegantwizardry.firsttaskdemoprofile.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elegantwizardry.firsttaskdemoprofile.R
import com.elegantwizardry.firsttaskdemoprofile.utils.AppConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Email_value.text = AppConstants.email
        tv_phone_value.text = AppConstants.phoneNumber

        switchToSecondTaskActivity()
    }

    private fun switchToSecondTaskActivity() {
        button_sayHi.setOnClickListener {
            var intent = Intent(this, SecondTaskActivity :: class.java)
            startActivity(intent)
        }
    }
}