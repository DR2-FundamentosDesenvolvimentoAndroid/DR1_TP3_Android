package com.example.dr1tp3android

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.dr1tp3android.ViewModel.InvestidorViewModel

class PerguntasActivity : AppCompatActivity() {

    private lateinit var investorViewModel: InvestidorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        //Da erro nessa linha de baixo, não sei usar isso ¬¬
//        investorViewModel.nome = intent.getStringExtra("nome") as String
    }
}
