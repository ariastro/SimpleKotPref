package com.astronout.kotpreftest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chibatching.kotpref.Kotpref
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Kotpref.init(this)

        btnSave.setOnClickListener {
            saveData()
        }

        btnShowData.setOnClickListener {
            showName.text = "Name: " + Profile.name
            showAge.text = "Age: " + Profile.age
            showJob.text = "Job: " + Profile.job
        }

    }

    private fun saveData(){
        Profile.name = editTextName.text.toString()
        Profile.age = editTextAge.text.toString()
        Profile.job = editTextJob.text.toString()
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
    }

}
