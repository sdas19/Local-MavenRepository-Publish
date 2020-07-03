package com.example.samplelibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample_library_impl.PrefProvider

class MainActivity : AppCompatActivity() {

    private lateinit var prefProvider: PrefProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefProvider = PrefProvider(this)
        prefProvider.getStringFromPref("A")
    }
}
