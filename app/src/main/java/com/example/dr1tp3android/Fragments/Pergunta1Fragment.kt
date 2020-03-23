package com.example.dr1tp3android.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import kotlinx.android.synthetic.main.fragment_pergunta1.*

class Pergunta1Fragment : Fragment() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }
        //TESTANDO SE FOI RECEBIDO COM SUCESSO O NOME DA ACTIVITY MAIN
//        Toast.makeText(activity, investidor.nome, Toast.LENGTH_LONG).show()

        btnProximo1.setOnClickListener{
            if(respostaA1.isChecked){
                investidor.acumulador += 0
                findNavController().navigate(R.id.pergunta2Fragment)
            }else if(respostaB1.isChecked){
                investidor.acumulador += 2
                findNavController().navigate(R.id.pergunta2Fragment)
            }else if(respostaC1.isChecked){
                investidor.acumulador += 3
                findNavController().navigate(R.id.pergunta2Fragment)
            }else if(respostaD1.isChecked){
                investidor.acumulador += 4
                findNavController().navigate(R.id.pergunta2Fragment)
            }else{
                Toast.makeText(context,
                    "Por favor escolha uma alternativa",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

}
