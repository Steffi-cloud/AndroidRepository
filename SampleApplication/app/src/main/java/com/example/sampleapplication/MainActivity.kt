package com.example.sampleapplication

import android.icu.lang.UCharacter
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleapplication.ui.theme.ClientRegistration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.client)
        setContent {
            ClientRegistration {
                val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
                val registerButton = findViewById<Button>(R.id.button)
                val phone=findViewById<EditText>(R.id.editTextPhone)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                        name = "AndroidRegisterApp",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

private fun MainActivity.ClientRegistration(function: @Composable () -> Unit) {
    fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun isValidPhoneNumber(phone: String): Boolean {
        return android.util.Patterns.PHONE.matcher(phone).matches()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!,you have successfully registered into the app",
        modifier = modifier//.layout(measure = Measurable())
    )
}

