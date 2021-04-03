package com.Kariba.assignment.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val phone = intent.getStringExtra("phone")
        val bodyWeight = intent.getStringExtra("bodyWeight")
        val husbandName = intent.getStringExtra("husbandName")
        val fatherName = intent.getStringExtra("fatherName")
        val motherName = intent.getStringExtra("motherName")
        val sisterName = intent.getStringExtra("sisterName")
        val countryName = intent.getStringExtra("countryName")



        textView_name_value.text = ": " + name.toString()
        textView_age_value.text = ": " + age.toString()
        textView_phone_value.text = ": " + phone.toString()
        textView_bodyWeight_value.text = ": " + bodyWeight.toString()
        textView_husbandName_value.text = ": " + husbandName.toString()
        textView_fatherName_value.text = ": " + fatherName.toString()
        textView_motherName_value.text = ": " + motherName.toString()
        textView_sisterName_value.text = ": " + sisterName.toString()
        textView_countryName_value.text = ": " + countryName.toString()
    }
}