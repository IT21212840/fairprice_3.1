package com.example.fairprice
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class CardActivity : AppCompatActivity() {

    private lateinit var cardNumber: String
    private lateinit var expiryDate: String
    private lateinit var cvv: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        // Initialize necessary views
        val cardNumberField = findViewById<EditText>(R.id.card_number)
        val expiryDateField = findViewById<EditText>(R.id.expiry_date)
        val cvvField = findViewById<EditText>(R.id.cvv)
        val submitButton = findViewById<Button>(R.id.payButton)

        // Set up click listener for submit button
        submitButton.setOnClickListener {
            // Get user inputs
            cardNumber = cardNumberField.text.toString().trim()
            expiryDate = expiryDateField.text.toString().trim()
            cvv = cvvField.text.toString().trim()

            // Validate user inputs
            if (!isValidCardNumber(cardNumber)) {
                Toast.makeText(this, "Please enter a valid card number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (!isValidExpiryDate(expiryDate)) {
                Toast.makeText(this, "Please enter a valid expiry date (MM/YY)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (!isValidCVV(cvv)) {
                Toast.makeText(this, "Please enter a valid CVV", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Process credit card information and perform any necessary actions
            // ...

            // Show success message
            Toast.makeText(this, "Payment successful", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidCardNumber(cardNumber: String): Boolean {
        return cardNumber.isNotEmpty() && cardNumber.length == 16
    }

    private fun isValidExpiryDate(expiryDate: String): Boolean {
        val pattern = "\\d{2}/\\d{2}".toRegex()
        return expiryDate.isNotEmpty() && pattern.matches(expiryDate)
    }

    private fun isValidCVV(cvv: String): Boolean {
        return cvv.isNotEmpty() && cvv.length == 3
    }
}
