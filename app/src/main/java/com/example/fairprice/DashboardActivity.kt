package com.example.fairprice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {

    private lateinit var profileButton: Button
    private lateinit var cardButton: Button
    private lateinit var deliveryButton: Button
    private lateinit var paymentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        // Find views by their IDs
        profileButton = findViewById(R.id.profileButton)
        cardButton = findViewById(R.id.cardButton)
        deliveryButton = findViewById(R.id.deliveryButton)
        paymentButton = findViewById(R.id.paymentButton)

        // Set onClick listeners for the buttons
        profileButton.setOnClickListener {
            onProfileButtonClick()
        }

        cardButton.setOnClickListener {
            onCardButtonClick()
        }

        deliveryButton.setOnClickListener {
            onDeliveryButtonClick()
        }

        paymentButton.setOnClickListener {
            onPaymentButtonClick()
        }
    }
    private fun onProfileButtonClick() {
        // Handle profile button click
        // Add your code here
    }

    private fun onCardButtonClick() {
        // Handle card button click
        // Add your code here
    }

    private fun onDeliveryButtonClick() {
        // Handle delivery button click
        // Add your code here
    }

    private fun onPaymentButtonClick() {
        // Handle payment button click
        // Add your code here
    }
}