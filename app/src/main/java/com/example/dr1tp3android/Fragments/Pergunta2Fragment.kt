package com.example.dr1tp3android.Fragments

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
import kotlinx.android.synthetic.main.fragment_pergunta2.*

class Pergunta2Fragment : Fragment() {
    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        btnProximo2.setOnClickListener{
            redirecionaFragment()
        }
    }

    fun redirecionaFragment(){
        if(respostaA2.isChecked){
            investidor.acumulador += 0
            findNavController().navigate(R.id.action_pergunta2Fragment_to_pergunta3Fragment)
        }else if(respostaB2.isChecked){
            investidor.acumulador += 2
            findNavController().navigate(R.id.action_pergunta2Fragment_to_pergunta3Fragment)
        }else if(respostaC2.isChecked){
            investidor.acumulador += 4
            findNavController().navigate(R.id.action_pergunta2Fragment_to_pergunta3Fragment)
        }else if(respostaD2.isChecked){
            investidor.acumulador += 5
            findNavController().navigate(R.id.action_pergunta2Fragment_to_pergunta3Fragment)
        }else{
            Toast.makeText(context,
                "Por favor escolha uma alternativa",
                Toast.LENGTH_SHORT).show()
        }
    }
}
