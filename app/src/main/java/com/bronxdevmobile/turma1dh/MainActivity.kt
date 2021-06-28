package com.bronxdevmobile.turma1dh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("lifecycle", "onCreate")



        findViewById<Button>(R.id.helloWorld).setOnClickListener {
            val intent = Intent(this@MainActivity, SplashActivity::class.java)
            intent.putExtra("nome", "Cesar Rodrigues")
            intent.putExtra("saldo", 50.0)
            intent.putExtra("saldoLong", 50L)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy")
    }
}