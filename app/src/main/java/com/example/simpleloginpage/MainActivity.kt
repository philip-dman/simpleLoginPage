package com.example.simpleloginpage

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val accounts = mapOf(
        "hanz" to "hanz",
        "philip" to "philip",
        "mrfro" to "mrfro"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val usernameInputText = findViewById<EditText>(R.id.usernameInput)
        val passwordInputText = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginBtn)

        loginButton.setOnClickListener {
            val username = usernameInputText.text.toString()
            val password = passwordInputText.text.toString()

            if (accounts[username] == password) {

                val intent = Intent (this, DashboardActivity::class.java)
                intent.putExtra("accountName", username)
                startActivity(intent)
                finish()
            }else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }


    }
}