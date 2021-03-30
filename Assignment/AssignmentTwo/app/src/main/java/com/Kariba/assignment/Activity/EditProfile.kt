package com.Kariba.assignment.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        button_submit.setOnClickListener {
            if(isValid()){
                switchToProfile()
            }
        }

    }

    private fun switchToProfile() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }

    private fun isValid(): Boolean {
        val name : String = editText_name.text.toString()
        val age : String = editText_age.text.toString()
        val phone : String = editText_phone.text.toString()
        val bodyWeight : String = editText_bodyWeight.text.toString()
        val husbandName : String = editText_husbandName.text.toString()
        val fatherName : String = editText_fatherName.text.toString()
        val motherName : String = editText_motherName.text.toString()
        val sisterName : String = editText_sisterName.text.toString()
        val countryName : String = editText_countryName.text.toString()

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