package com.example.fairprice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var password: String
    private lateinit var confirmPassword: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupButton = findViewById<Button>(R.id.signupButton)
        signupButton.setOnClickListener {


            // Call the signup function
            onSignupButtonClick()
        }
    }

    private fun onSignupButtonClick() {
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val confirmPasswordInput = findViewById<EditText>(R.id.confirmPasswordInput)

        // Get the input field values
        name = nameInput.text.toString()
        email = emailInput.text.toString()
        password = passwordInput.text.toString()
        confirmPassword = confirmPasswordInput.text.toString()
    }
}