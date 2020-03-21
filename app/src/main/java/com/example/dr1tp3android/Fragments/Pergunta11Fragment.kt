package com.example.dr1tp3android.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import android.widget.Toast
import com.example.dr1tp3android.PerguntasActivity
import kotlinx.android.synthetic.main.fragment_pergunta11.*
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ResultadoActivity
import com.example.dr1tp3android.ViewModel.InvestidorViewModel

/**
 * A simple [Fragment] subclass.
 */
class Pergunta11Fragment : Fragment() {
    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta11, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }


        btnProximo11.setOnClickListener{
            if(respostaA11.isChecked){
                investidor.acumulador += 0
            }else if(respostaB11.isChecked){
                investidor.acumulador += 1
            }else if(respostaC11.isChecked){
                investidor.acumulador += 2
            }else if(respostaD11.isChecked){
                investidor.acumulador += 4
            }else if(respostaE11.isChecked){
                investidor.acumulador += 5
            }else{
                Toast.makeText(context,
                    "Por favor escolha uma alternativa",
                    Toast.LENGTH_SHORT).show()
            }


            var pontos = investidor.acumulador
            var perfil = when(pontos){
                in 0..12 -> "CONSERVADOR"
                in 13..29 -> "MODERADO"
                else -> "ARROJADO"

            }
            val intent = Intent(activity, ResultadoActivity::class.java)
            intent.putExtra("perfil", perfil)
            intent.putExtra("nome", investidor.nome)

            startActivity(intent)

        }
    }

}
