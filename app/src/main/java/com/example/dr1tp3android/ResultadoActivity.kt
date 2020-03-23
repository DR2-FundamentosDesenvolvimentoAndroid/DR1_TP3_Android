package com.example.dr1tp3android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.getSerializableExtra("nome") as String
        val resultado = intent.getSerializableExtra("resultado") as String

        edTxtNomeResultado.text = nome
        edTxtPerfilResultado.text = resultado
    }
}
