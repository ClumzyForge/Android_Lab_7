package com.clumzyforge.android_lab_7

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btn).setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra("data", "Dane: ${findViewById<EditText>(R.id.editText).text}")

            startActivity(intent)

        })

        findViewById<Button>(R.id.btn2).setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, MainActivity3::class.java)

            startActivity(intent)

            finish()

        })
    }
}