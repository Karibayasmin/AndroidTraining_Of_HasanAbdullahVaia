package com.kariba.assignmentthree.preference

/**
 * Created by Kariba Yasmin on 7/14/21.
 */
interface AppPreference {

    companion object{
        const val UserName = "username"
        const val Password = "password"
        const val isLoggedIn = "is_logged_in"
    }

    fun getString(key: String): String?
    fun setString(key: String, value: String)
    fun getInt(key: String): Int?
    fun setInt(key : String, value: Int)
    fun getBoolean(key: String): Boolean?
    fun setBoolean(key: String, value: Boolean)

}