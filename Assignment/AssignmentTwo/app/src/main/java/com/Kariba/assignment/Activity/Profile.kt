package com.Kariba.assignment.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
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
    }
}