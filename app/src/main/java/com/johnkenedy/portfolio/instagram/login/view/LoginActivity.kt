package com.johnkenedy.portfolio.instagram.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout
import com.johnkenedy.portfolio.instagram.R

class LoginActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    findViewById<TextInputLayout>(R.id.til_login_email)
      .error = "Esse e-mail é invalido"
  }
}