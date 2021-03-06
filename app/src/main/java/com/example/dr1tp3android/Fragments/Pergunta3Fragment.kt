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
import kotlinx.android.synthetic.main.fragment_pergunta3.*

/**
 * A simple [Fragment] subclass.
 */
class Pergunta3Fragment : Fragment() {
    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        btnProximo3.setOnClickListener{
            redirecionaFragment()
        }
    }

    fun redirecionaFragment(){
        if(respostaA3.isChecked){
            investidor.acumulador += 0
            findNavController().navigate(R.id.action_pergunta3Fragment_to_pergunta4Fragment)
        }else if(respostaB3.isChecked){
            investidor.acumulador += 1
            findNavController().navigate(R.id.action_pergunta3Fragment_to_pergunta4Fragment)
        }else if(respostaC3.isChecked){
            investidor.acumulador += 2
            findNavController().navigate(R.id.action_pergunta3Fragment_to_pergunta4Fragment)
        }else if(respostaD3.isChecked){
            investidor.acumulador += 4
            findNavController().navigate(R.id.action_pergunta3Fragment_to_pergunta4Fragment)
        }else{
            Toast.makeText(context,
                "Por favor escolha uma alternativa",
                Toast.LENGTH_SHORT).show()
        }
    }
}
