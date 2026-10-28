package com.example.module6espiritu

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnExploreDashboard = findViewById<Button>(R.id.btnExploreDashboard)
        val btnOpenInquiryForm = findViewById<Button>(R.id.btnOpenInquiryForm)
        val btnQuickContact = findViewById<Button>(R.id.btnQuickContact)

        btnExploreDashboard.setOnClickListener {
            Toast.makeText(this, "Dashboard button ready for Module 7 Explicit Intent", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Explicit Intent):
            // startActivity(Intent(this, DashboardActivity::class.java))
        }

        btnOpenInquiryForm.setOnClickListener {
            Toast.makeText(this, "Inquiry Form button ready for Module 7 Explicit Intent", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Explicit Intent):
            // startActivity(Intent(this, RegistrationActivity::class.java))
        }

        btnQuickContact.setOnClickListener {
            Toast.makeText(this, "Contact Screen button ready for Module 7 Explicit Intent", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Explicit Intent):
            // startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}
