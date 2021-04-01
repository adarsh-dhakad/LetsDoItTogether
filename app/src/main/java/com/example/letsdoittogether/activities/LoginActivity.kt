package com.example.letsdoittogether.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.letsdoittogether.R
import com.example.letsdoittogether.utils.MSPTextViewBold


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
             window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        val tv_registration = findViewById<MSPTextViewBold>(R.id.tv_register)
        tv_registration.setOnClickListener{
            val i = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(i)
        }


    }
}