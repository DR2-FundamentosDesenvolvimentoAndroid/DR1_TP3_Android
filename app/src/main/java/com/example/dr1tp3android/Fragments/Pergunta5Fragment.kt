package com.example.dr1tp3android.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_pergunta5.*

/**
 * A simple [Fragment] subclass.
 */
class Pergunta5Fragment : Fragment() {
    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        btnProximo5.setOnClickListener{
            redirecionaFragment()
        }
    }

    fun redirecionaFragment(){
        if(respostaA5.isChecked){
            investidor.acumulador += 0
            findNavController().navigate(R.id.action_pergunta5Fragment_to_pergunta6Fragment2)
        }else if(respostaB5.isChecked){
            investidor.acumulador += 2
            findNavController().navigate(R.id.action_pergunta5Fragment_to_pergunta6Fragment2)
        }else if(respostaC5.isChecked){
            investidor.acumulador += 4
            findNavController().navigate(R.id.action_pergunta5Fragment_to_pergunta6Fragment2)
        }else{
            Toast.makeText(context,
                "Por favor escolha uma alternativa",
                Toast.LENGTH_SHORT).show()
        }
    }
}
