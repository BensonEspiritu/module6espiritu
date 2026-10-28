package com.example.module6espiritu

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnMenuCaseStudy = findViewById<Button>(R.id.btnMenuCaseStudy)
        val btnMenuRegisterInquiry = findViewById<Button>(R.id.btnMenuRegisterInquiry)
        val btnMenuContactShare = findViewById<Button>(R.id.btnMenuContactShare)
        val btnMenuBackWelcome = findViewById<Button>(R.id.btnMenuBackWelcome)

        btnMenuCaseStudy.setOnClickListener {
            Toast.makeText(this, "Opening Project Details (Module 7 Explicit Intent)", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: startActivity(Intent(this, DetailsActivity::class.java))
        }

        btnMenuRegisterInquiry.setOnClickListener {
            Toast.makeText(this, "Opening Registration Form (Module 7 Explicit Intent)", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: startActivity(Intent(this, RegistrationActivity::class.java))
        }

        btnMenuContactShare.setOnClickListener {
            Toast.makeText(this, "Opening Contact & Share Hub (Module 7 Explicit Intent)", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: startActivity(Intent(this, ContactActivity::class.java))
        }

        btnMenuBackWelcome.setOnClickListener {
            Toast.makeText(this, "Returning to Welcome Screen (Module 7 Explicit Intent)", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: finish()
        }
    }
}
