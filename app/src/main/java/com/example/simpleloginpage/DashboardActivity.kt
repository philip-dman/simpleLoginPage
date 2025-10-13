package com.example.simpleloginpage
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_layout)

        val welcomeTextView = findViewById<TextView>(R.id.textTitle)
        val accountName = intent.getStringExtra("accountName")
        welcomeTextView.text = "Welcome to Dashboard, $accountName!"

        val gotoAbout = Intent (this, AboutUsActivity::class.java)
        val gotoService = Intent (this, ServicesActivity::class.java)
        val gotoStaff = Intent (this, StaffActivity::class.java)
        val gotoContact = Intent (this, ContactsActivity::class.java)
        val gotoMain = Intent (this, MainActivity::class.java)

        val logoutBtn = findViewById<Button>(R.id.logoutBtn)
        val aboutUsBtn = findViewById<Button>(R.id.aboutUsBtn)
        val servicesBtn = findViewById<Button>(R.id.servicesBtn)
        val staffBtn = findViewById<Button>(R.id.staffBtn)
        val contactsBtn = findViewById<Button>(R.id.contactsBtn)

        aboutUsBtn.setOnClickListener {
            startActivity(gotoAbout)
        }
        servicesBtn.setOnClickListener {
            startActivity(gotoService)
        }
        staffBtn.setOnClickListener {
            startActivity(gotoStaff)
        }
        contactsBtn.setOnClickListener {
            startActivity(gotoContact)
        }
        logoutBtn.setOnClickListener {
            startActivity(gotoMain)
        }

    }
}