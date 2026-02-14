/**
 * Course: MAD302-01 Android Development
 * Lab: 1
 * Name: Ishmeet Singh
 * Student ID: A00202436
 * Date: 2026-02-14
 */

package com.example.profilelistapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val profiles = mutableListOf<Profile>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle", "onCreate called")

        val editName = findViewById<EditText>(R.id.editName)
        val editAge = findViewById<EditText>(R.id.editAge)
        val btnAdd = findViewById<Button>(R.id.btnAddProfile)
        val txtDisplay = findViewById<TextView>(R.id.txtDisplayProfiles)

        btnAdd.setOnClickListener {

            val name = editName.text.toString()
            val age = editAge.text.toString().toInt()

            val profile = Profile(name, age)
            profiles.add(profile)

            var displayText = ""

            for (p in profiles) {
                displayText += "${p.name} – ${p.age}\n"
            }

            txtDisplay.text = displayText

            editName.text.clear()
            editAge.text.clear()
        }
    }

    override fun onStart() { super.onStart(); Log.d("Lifecycle","onStart called") }
    override fun onResume() { super.onResume(); Log.d("Lifecycle","onResume called") }
    override fun onPause() { super.onPause(); Log.d("Lifecycle","onPause called") }
    override fun onStop() { super.onStop(); Log.d("Lifecycle","onStop called") }
    override fun onDestroy() { super.onDestroy(); Log.d("Lifecycle","onDestroy called") }
}
