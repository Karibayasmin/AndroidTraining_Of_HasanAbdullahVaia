package com.kariba.assignmentthree.preference

/**
 * Created by Kariba Yasmin on 7/14/21.
 */
interface AppPreference {

    companion object{  //companion object is equivalent of static method of java.
        const val NAME = "name"
        const val PHONE_NUMBER = "phone_number"
        const val EMAIL_ADDRESS = "email_address"
        const val USER_ID = "user_id"
        const val PASSWORD = "password"
        const val REPEAT_PASSWORD = "repeat_password"
        const val WEBSITE_URL = "website_url"
        const val IS_LOGGED_IN = "is_logged_in"
    }

    fun getString(key: String): String?
    fun setString(key: String, value: String)
    fun getInt(key: String): Int?
    fun setInt(key : String, value: Int)
    fun getBoolean(key: String): Boolean?
    fun setBoolean(key: String, value: Boolean)
    fun setIsLoggedData(key: String, value: Boolean)
    fun getIsLoggedData(key: String): Boolean?

}