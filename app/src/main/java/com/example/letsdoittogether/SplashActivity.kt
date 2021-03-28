package com.example.letsdoittogether

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.TextView


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
// hide statusbar
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        // font
    val typeface:Typeface = Typeface.createFromAsset(assets,"Rainday.ttf")
    val tv_title  = findViewById<TextView>(R.id.tv_title)
    tv_title.typeface = typeface
    val typeface2:Typeface = Typeface.createFromAsset(assets,"Donathe.ttf")
        val tv_title2  = findViewById<TextView>(R.id.tv_title2)
        tv_title2.typeface = typeface2

    Handler().postDelayed(
        {
     val intent = Intent(this@SplashActivity, MainActivity::class.java)
     startActivity(intent)
     finish()
        },

 3000   )
}}