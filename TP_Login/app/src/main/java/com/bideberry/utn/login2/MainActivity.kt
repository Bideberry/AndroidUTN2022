package com.bideberry.utn.login2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.text.Editable
import android.text.InputType
import android.text.InputType.*
import android.text.TextWatcher
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botonLogin = findViewById<Button>(R.id.button_login)
        val usernameEditText = findViewById<EditText>(R.id.edittext_username)
        val passwordEditText = findViewById<EditText>(R.id.edittext_password)
        val usernameCheckLabel = findViewById<TextView>(R.id.textview_usernamecheck)
        val passwordCheckLabel = findViewById<TextView>(R.id.textview_passwordcheck)
        val botonTogglePassword = findViewById<ImageButton>(R.id.button_toggle_password)


        botonLogin.setOnClickListener {
            var user: Boolean = true
            var pass: Boolean = true
            if (!checkUsername(usernameEditText.text.toString())) {
                usernameCheckLabel.visibility = View.VISIBLE
                user = false
            }
            if (!checkPassword(passwordEditText.text.toString())) {
                passwordCheckLabel.visibility = View.VISIBLE
                pass = false
            }
            if (user && pass)
                Toast.makeText(applicationContext, "Bienvenido a la UTN", Toast.LENGTH_SHORT).show()
        }


        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                usernameCheckLabel.visibility = View.INVISIBLE
                passwordCheckLabel.visibility = View.INVISIBLE
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        usernameEditText.addTextChangedListener(textWatcher)
        passwordEditText.addTextChangedListener(textWatcher)


        botonTogglePassword.setOnClickListener {
            if (passwordEditText.inputType == TYPE_TEXT_VARIATION_PASSWORD) {
                passwordEditText.inputType = TYPE_TEXT_VARIATION_NORMAL
            }
            else {
                passwordEditText.inputType = TYPE_TEXT_VARIATION_PASSWORD
            }
        }

    }

    private fun checkUsername(inputText: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(inputText).matches()
    }

    private fun checkPassword(inputText: String): Boolean {
        if (inputText.length < 8) return false
        if (inputText.none { it in 'A'..'Z' }) return false
        if (inputText.none { it in 'a'..'z' }) return false
        if (inputText.none { it in '0'..'9' }) return false
        return inputText.none { it !in 'A'..'Z' && it !in 'a'..'z' && it !in '0'..'9' }
    }
}