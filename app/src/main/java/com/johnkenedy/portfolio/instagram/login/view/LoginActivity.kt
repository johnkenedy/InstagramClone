package com.johnkenedy.portfolio.instagram.login.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.johnkenedy.portfolio.instagram.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextEmail = findViewById<EditText>(R.id.et_login_email)
        val editTextPassword = findViewById<EditText>(R.id.et_login_password)

        editTextEmail.addTextChangedListener(watcher)
        editTextPassword.addTextChangedListener(watcher)

        findViewById<Button>(R.id.btn_login_enter).setOnClickListener {
          findViewById<TextInputLayout>(R.id.til_login_email).error = "Invalid Email"
          findViewById<TextInputLayout>(R.id.til_login_password).error = "Invalid password"
        }

    }

    private val watcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            findViewById<Button>(R.id.btn_login_enter).isEnabled = p0.toString().isNotEmpty()
        }

        override fun afterTextChanged(p0: Editable?) {
        }

    }

}