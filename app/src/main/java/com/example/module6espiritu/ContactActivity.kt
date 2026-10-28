package com.example.module6espiritu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val etEmailSubject = findViewById<EditText>(R.id.etEmailSubject)
        val etEmailBody = findViewById<EditText>(R.id.etEmailBody)

        val btnActionSendEmail = findViewById<Button>(R.id.btnActionSendEmail)
        val btnActionSharePortfolio = findViewById<Button>(R.id.btnActionSharePortfolio)
        val btnActionOpenGithub = findViewById<Button>(R.id.btnActionOpenGithub)
        val btnActionViewMap = findViewById<Button>(R.id.btnActionViewMap)
        val btnBackFromContact = findViewById<Button>(R.id.btnBackFromContact)

        btnActionSendEmail.setOnClickListener {
            val subject = etEmailSubject.text.toString()
            Toast.makeText(this, "Prepared Email: $subject (Module 7 Implicit Intent)", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Implicit Intent - Email):
            // val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:parinasbenson000@gmail.com")).apply {
            //     putExtra(Intent.EXTRA_SUBJECT, subject)
            //     putExtra(Intent.EXTRA_TEXT, etEmailBody.text.toString())
            // }
            // startActivity(emailIntent)
        }

        btnActionSharePortfolio.setOnClickListener {
            Toast.makeText(this, "Share Portfolio ready for Module 7 ACTION_SEND", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Implicit Intent - Share Text):
            // val shareIntent = Intent(Intent.ACTION_SEND).apply {
            //     type = "text/plain"
            //     putExtra(Intent.EXTRA_TEXT, etEmailBody.text.toString())
            // }
            // startActivity(Intent.createChooser(shareIntent, "Share Portfolio via"))
        }

        btnActionOpenGithub.setOnClickListener {
            Toast.makeText(this, "Open GitHub ready for Module 7 ACTION_VIEW", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Implicit Intent - Open Website):
            // startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/benson-espiritu")))
        }

        btnActionViewMap.setOnClickListener {
            Toast.makeText(this, "View Location ready for Module 7 Geo Intent", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO (Implicit Intent - Map Location):
            // startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:14.6042,120.9886?q=FEU+Institute+of+Technology")))
        }

        btnBackFromContact.setOnClickListener {
            Toast.makeText(this, "Back button ready for Module 7 navigation", Toast.LENGTH_SHORT).show()
            // MODULE 7 TODO: finish()
        }
    }
}
