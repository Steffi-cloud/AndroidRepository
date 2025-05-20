package com.example.androidapp1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidapp1.ui.theme.AndroidApp1Theme
//ae stanga king
class MainActivity : ComponentActivity() {
   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidApp1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidApp1Theme {
        Greeting("Android")
    }*/


    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.client_ui)

        // Initialize UI elements
        usernameEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        phoneEditText = findViewById(R.id.editTextPhone)
        registerButton = findViewById(R.id.button)

        // Set click listener for the register button
        registerButton.setOnClickListener {
            // Get the entered data
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val phone = phoneEditText.text.toString()

            // Validate the data (example: check for empty fields)
            if (username.isEmpty() || password.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Implement data validation, storage (e.g., SQLite or Firebase)

            // Example: Display a Toast message
            Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()

            // TODO:  Navigate to the next activity or perform other actions
        }
    }
}