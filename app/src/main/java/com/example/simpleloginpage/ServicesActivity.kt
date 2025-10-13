package com.example.simpleloginpage
import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ServicesActivity: AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.services_layout)

        val backBtn = findViewById<Button>(R.id.returnBtn2)
        backBtn.setOnClickListener{
            finish()
        }
    }
}