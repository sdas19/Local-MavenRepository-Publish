package com.example.sample_library_impl

import android.content.Context
import android.content.pm.PackageManager
import com.example.samplelibrary.IAppDetails

object AppDetails : IAppDetails {

    override fun appName(context: Context): String {
        val packageName = context.packageName
        val packageManager= context.applicationContext.packageManager
        return packageManager.getApplicationLabel(
            packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)) as String
    }

}