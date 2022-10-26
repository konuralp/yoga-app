package com.example.yoga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme(getPreferences(MODE_PRIVATE).getInt("theme", R.style.Theme_Yoga))

        val fragment = StatisticsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, fragment)
        transaction.commit()

//        PopupSettingsFragment().show(supportFragmentManager, PopupSettingsFragment.TAG)
    }
}