package com.example.dr1tp3android

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.example.dr1tp3android.ViewModel.InvestidorViewModel

class PerguntasActivity : AppCompatActivity() {

    private lateinit var investidor: InvestidorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)
        investidor = ViewModelProviders.of(this).get(InvestidorViewModel::class.java)

        //Da erro nessa linha de baixo, não sei usar isso ¬¬
        investidor.nome = intent.getStringExtra("nome") as String
    }
}
