package com.example.sample_library_impl

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.example.samplelibrary.IPrefProvider

class PrefProvider(context: Context): IPrefProvider {

    private val pref: SharedPreferences by
            lazy{ context.getSharedPreferences(AppDetails.appName(context), MODE_PRIVATE) }

    override fun getStringFromPref(key: String, defaultValue: String?) {
        defaultValue?.let {
            pref.getString(key, defaultValue)
        } ?: run {
            pref.getString(key, "")
        }
    }

}