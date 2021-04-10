package com.Kariba.assignment.Activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    val colonMark : String? = ": "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        getDataFromEditProfile()

    }


    private fun getDataFromEditProfile() {
        /*This is one of the way to get data from one activity to another*/

        val bundle = intent.extras

        val name = bundle?.getString("name")
        val age = bundle?.getString("age")
        val phone = bundle?.getString("phone")
        val bodyWeight = bundle?.getString("bodyWeight")
        val husbandName = bundle?.getString("husbandName")
        val fatherName = bundle?.getString("fatherName")
        val motherName = bundle?.getString("motherName")
        val sisterName = bundle?.getString("sisterName")
        val countryName = bundle?.getString("countryName")

        /*val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val phone = intent.getStringExtra("phone")
        val bodyWeight = intent.getStringExtra("bodyWeight")
        val husbandName = intent.getStringExtra("husbandName")
        val fatherName = intent.getStringExtra("fatherName")
        val motherName = intent.getStringExtra("motherName")
        val sisterName = intent.getStringExtra("sisterName")
        val countryName = intent.getStringExtra("countryName")*/
        
        textView_name_value.text = ("$colonMark $name")
        textView_age_value.text = (": $age")
        textView_phone_value.text = (": $phone")
        textView_bodyWeight_value.text = (":  + $bodyWeight")
        textView_husbandName_value.text = (": $husbandName")
        textView_fatherName_value.text = (": $fatherName")
        textView_motherName_value.text = (": $motherName")
        textView_sisterName_value.text = (": $sisterName")
        textView_countryName_value.text = (": $countryName")
    }
}