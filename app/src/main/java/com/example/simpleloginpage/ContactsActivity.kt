package com.example.simpleloginpage
import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class ContactsActivity: AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_layout)

        val backBtn = findViewById<Button>(R.id.returnBtn4)
        backBtn.setOnClickListener{
            finish()
        }
    }
}