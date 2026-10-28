package com.example.module6espiritu

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val etVisitorName = findViewById<EditText>(R.id.etVisitorName)
        val etVisitorEmail = findViewById<EditText>(R.id.etVisitorEmail)
        val etOrganization = findViewById<EditText>(R.id.etOrganization)
        val etProjectNotes = findViewById<EditText>(R.id.etProjectNotes)

        val rgInquiryType = findViewById<RadioGroup>(R.id.rgInquiryType)
        val rbInternshipOffer = findViewById<RadioButton>(R.id.rbInternshipOffer)
        val spProjectDomain = findViewById<Spinner>(R.id.spProjectDomain)

        val cbRequestResume = findViewById<CheckBox>(R.id.cbRequestResume)
        val cbSourceCodeAccess = findViewById<CheckBox>(R.id.cbSourceCodeAccess)
        val cbScheduleInterview = findViewById<CheckBox>(R.id.cbScheduleInterview)
        val swUrgentPriority = findViewById<Switch>(R.id.swUrgentPriority)

        val btnClearForm = findViewById<Button>(R.id.btnClearForm)
        val btnSubmitRegistration = findViewById<Button>(R.id.btnSubmitRegistration)

        // Basic UI Event allowed in Lab 5 (Instruction VI.6): Clear / Reset all controls
        btnClearForm.setOnClickListener {
            etVisitorName.text.clear()
            etVisitorEmail.text.clear()
            etOrganization.text.clear()
            etProjectNotes.text.clear()
            rbInternshipOffer.isChecked = true
            spProjectDomain.setSelection(0)
            cbRequestResume.isChecked = false
            cbSourceCodeAccess.isChecked = false
            cbScheduleInterview.isChecked = false
            swUrgentPriority.isChecked = false
            Toast.makeText(this, "Form fields cleared", Toast.LENGTH_SHORT).show()
        }

        btnSubmitRegistration.setOnClickListener {
            val name = etVisitorName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your Full Name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Inquiry saved for $name! (Ready for Module 7 Bundle transmission)",
                    Toast.LENGTH_SHORT
                ).show()
                // MODULE 7 TODO (Explicit Intent + Bundle transmission to DetailsActivity):
                // val intent = Intent(this, DetailsActivity::class.java)
                // val bundle = Bundle().apply {
                //     putString("EXTRA_NAME", name)
                //     putString("EXTRA_EMAIL", etVisitorEmail.text.toString().trim())
                //     putString("EXTRA_ORG", etOrganization.text.toString().trim())
                //     putString("EXTRA_DOMAIN", spProjectDomain.selectedItem.toString())
                //     putBoolean("EXTRA_URGENT", swUrgentPriority.isChecked)
                //     putString("EXTRA_NOTES", etProjectNotes.text.toString().trim())
                // }
                // intent.putExtras(bundle)
                // startActivity(intent)
            }
        }
    }
}
