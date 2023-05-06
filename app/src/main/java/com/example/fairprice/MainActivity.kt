package com.example.fairprice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginButton   = findViewById<Button>(R.id.loginButton)
        var signupButton   = findViewById<Button>(R.id.signupButton)

        loginButton.setOnClickListener {
            // Handle login button click
            onLoginButtonClick()
        }

        signupButton.setOnClickListener {
            // Handle signup button click
            onSignupButtonClick()
        }
    }
    private fun onLoginButtonClick() {
        // Implement your login button functionality here
    }

    private fun onSignupButtonClick() {
        // Implement your signup button functionality here
    }
}