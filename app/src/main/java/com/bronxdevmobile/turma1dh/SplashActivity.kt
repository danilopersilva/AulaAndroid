package com.bronxdevmobile.turma1dh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val nome = intent.getStringExtra("nome")
        val saldo = intent.getDoubleExtra("saldo",0.0)
        val saldoLong = intent.getLongExtra("saldoLong",0L)

        Log.i("resultIntent","Meu nome é - $nome " +
                "o saldo é $saldo e saldo em long é $saldoLong")

        Log.i("lifecycle", "onCreate")
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