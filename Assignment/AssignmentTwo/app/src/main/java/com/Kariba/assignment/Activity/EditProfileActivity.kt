package com.Kariba.assignment.Activity

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.layout_toolbar.*

class EditProfileActivity : AppCompatActivity() {

     var name : String = ""
     var age : String = ""
     var phone : String = ""
     var bodyWeight : String = ""
     var husbandName : String = ""
     var fatherName : String = ""
     var motherName : String = ""
     var sisterName : String = ""
     var countryName : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        button_submit.setOnClickListener {
            if(isValid()){
                switchToProfileActivity()
            }
        }

        customizeToolbar(getString(R.string.edit_profile))

    }

    private fun customizeToolbar(title : String) {

        toolbar_background.setBackgroundColor(
            ContextCompat.getColor(this, R.color.design_default_color_primary_dark)
        )

        ImageViewCompat.setImageTintList(
            toolbar_back_button,
            ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white))
        )

        toolbar_back_button.setOnClickListener {
           // onBackPressed()
            finish()
        }

        toolbar_title.text = title
        toolbar_title.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    private fun switchToProfileActivity() {

        /*Bundle is the another way of passing data*/

        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("age", age)
        bundle.putString("phone", phone)
        bundle.putString("bodyWeight", bodyWeight)
        bundle.putString("husbandName", husbandName)
        bundle.putString("fatherName", fatherName)
        bundle.putString("motherName", motherName)
        bundle.putString("sisterName", sisterName)
        bundle.putString("countryName", countryName)

        val intent = Intent(this, ProfileActivity::class.java)

        /*It's one of the way of passing data one activity to another*/

        /*intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("phone", phone)
        intent.putExtra("bodyWeight", bodyWeight)
        intent.putExtra("husbandName", husbandName)
        intent.putExtra("fatherName", fatherName)
        intent.putExtra("motherName", motherName)
        intent.putExtra("sisterName", sisterName)
        intent.putExtra("countryName", countryName)*/
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun isValid(): Boolean {
        /*Meaning of line: ? mark telling check is editText_name null or not,
        * if it is not null then take text from it and then make it string and
        * put it to name. it's called null safety check.*/

        name = editText_name?.text.toString()

        /*Above line is equivalent to below 3 lines (74, 75, 76)*/
        /*if(editText_name != null){
            name = editText_name.text.toString()
        }*/

        age = editText_age?.text.toString()
        phone = editText_phone?.text.toString()
        bodyWeight = editText_bodyWeight?.text.toString()
        husbandName = editText_husbandName?.text.toString()
        fatherName = editText_fatherName?.text.toString()
        motherName = editText_motherName?.text.toString()
        sisterName = editText_sisterName?.text.toString()
        countryName = editText_countryName?.text.toString()


        if(name.trim().isNotEmpty() &&
                age.trim().isNotEmpty() &&
                phone.trim().isNotEmpty() &&
                bodyWeight.trim().isNotEmpty() &&
                husbandName.trim().isNotEmpty() &&
                fatherName.trim().isNotEmpty() &&
                motherName.trim().isNotEmpty() &&
                sisterName.trim().isNotEmpty() &&
                countryName.trim().isNotEmpty()){
            Toast.makeText(this,getString(R.string.data_submitted_successfully),Toast.LENGTH_SHORT).show()
            return true

        }else if(name.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_name),Toast.LENGTH_SHORT).show()

        }else if(age.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_age),Toast.LENGTH_LONG).show()

        }else if(phone.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_phone_number),Toast.LENGTH_LONG).show()

        }else if(bodyWeight.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_body_weight),Toast.LENGTH_LONG).show()

        }else if(husbandName.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.husband_s_name),Toast.LENGTH_LONG).show()

        }else if(fatherName.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_father_s_name),Toast.LENGTH_LONG).show()

        }else if(motherName.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_mother_s_name),Toast.LENGTH_LONG).show()

        }else if(sisterName.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_sister_s_name),Toast.LENGTH_LONG).show()
        }else if(countryName.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_your_country_name),Toast.LENGTH_LONG).show()
        }

        return false
    }
}