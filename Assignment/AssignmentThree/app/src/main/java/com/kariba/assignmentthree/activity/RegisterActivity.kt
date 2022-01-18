package com.kariba.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kariba.assignmentthree.R
import com.kariba.assignmentthree.preference.AppPreference
import com.kariba.assignmentthree.preference.AppPreferenceImpl
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var appPreference: AppPreference

    var name = ""
    var phone = ""
    var email = ""
    var userId = ""
    var password = ""
    var repeatPassword = ""
    var websiteUrl = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        appPreference = AppPreferenceImpl(this)

        switchToProfile()
    }

    private fun setDataInSharedPreference() {
        appPreference.setString(AppPreference.NAME, name)
        appPreference.setString(AppPreference.PHONE_NUMBER, phone)
        appPreference.setString(AppPreference.EMAIL_ADDRESS, email)
        appPreference.setString(AppPreference.USER_ID, userId)
        appPreference.setString(AppPreference.PASSWORD, password)
        appPreference.setString(AppPreference.REPEAT_PASSWORD, repeatPassword)
        appPreference.setString(AppPreference.WEBSITE_URL, websiteUrl)
    }

    private fun switchToProfile() {
        button_register.setOnClickListener {

            convertDataToString()

            if(!isValid()){
                return@setOnClickListener

            }else{
                setDataInSharedPreference()

                var intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun convertDataToString() {
        name = editText_name.text.toString()
        phone = editText_phone.text.toString()
        email = editText_email.text.toString()
        userId = editText_userId.text.toString()
        password = editText_password.text.toString()
        repeatPassword = editText_repeatPassword.text.toString()
        websiteUrl = editText_websiteUrl.text.toString()
    }

    private fun isValid() : Boolean{

       if(name.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_name), Toast.LENGTH_SHORT).show()
         return false

       }

       if(phone.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_phone_number), Toast.LENGTH_SHORT).show()
         return false

       }

       if(email.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_email_address), Toast.LENGTH_SHORT).show()
         return false

       }

       if(userId.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_user_id), Toast.LENGTH_SHORT).show()
         return false

       }

       if(password.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_password), Toast.LENGTH_SHORT).show()
         return false

       }

       if(repeatPassword.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_repeat_password), Toast.LENGTH_SHORT).show()
         return false

       }

       if(websiteUrl.isEmpty()){
           Toast.makeText(this, getString(R.string.enter_website_url), Toast.LENGTH_SHORT).show()
         return false
       }

       return true
   }
}