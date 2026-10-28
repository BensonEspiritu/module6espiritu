package com.example.module6espiritu

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val btnBackFromDetails = findViewById<Button>(R.id.btnBackFromDetails)

        // MODULE 7 TODO: Retrieve Bundle / Intent Extras from RegistrationActivity
        // and populate tvReceivedName, tvReceivedEmail, tvReceivedOrg, etc.

        btnBackFromDetails.setOnClickListener {
            Toast.makeText(this, "Return button ready for Module 7 navigation", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: finish()
        }
    }
}
