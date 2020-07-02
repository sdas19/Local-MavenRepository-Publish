package com.example.samplelibrary

interface IPrefProvider {

    fun getStringFromPref(key: String, defaultValue: String? = null)
}