package com.example.dr1tp3android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.dr1tp3android.ViewModel.InvestidorViewModel

class PerguntasActivity : AppCompatActivity() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)
        investidor = ViewModelProviders.of(this).get(InvestidorViewModel::class.java)

        investidor.nome = intent.getStringExtra("nome") as String
    }
}
