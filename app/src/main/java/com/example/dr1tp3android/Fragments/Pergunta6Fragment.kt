package com.example.dr1tp3android.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_pergunta6.*
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ViewModel.InvestidorViewModel

/**
 * A simple [Fragment] subclass.
 */
class Pergunta6Fragment : Fragment() {
    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        btnProximo6.setOnClickListener{
            redirecionaFragment()
        }
    }

    fun redirecionaFragment(){
        if(respostaA6.isChecked){
            investidor.acumulador += 0
            findNavController().navigate(R.id.action_pergunta6Fragment_to_pergunta7Fragment2)
        }else if(respostaB6.isChecked){
            investidor.acumulador += 2
            findNavController().navigate(R.id.action_pergunta6Fragment_to_pergunta7Fragment2)
        }else if(respostaC6.isChecked){
            investidor.acumulador += 3
            findNavController().navigate(R.id.action_pergunta6Fragment_to_pergunta7Fragment2)
        }else if(respostaD6.isChecked){
            investidor.acumulador += 4
            findNavController().navigate(R.id.action_pergunta6Fragment_to_pergunta7Fragment2)
        }else{
            Toast.makeText(context,
                "Por favor escolha uma alternativa",
                Toast.LENGTH_SHORT).show()
        }
    }
}
