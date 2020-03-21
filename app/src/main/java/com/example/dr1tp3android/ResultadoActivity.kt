package com.example.dr1tp3android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import kotlinx.android.synthetic.main.fragment_resultado.*

class ResultadoActivity : AppCompatActivity() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

//        var nome = intent.getSerializableExtra("nome") as String
//        var perfil = intent.getSerializableExtra("perfil") as String

        edTxtNomeResultado.setText(investidor.nome)
        edTxtNomeResultado.setText(investidor.acumulador)
    }
}
