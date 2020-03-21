package com.example.dr1tp3android.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import kotlinx.android.synthetic.main.fragment_resultado.*

/**
 * A simple [Fragment] subclass.
 */
class ResultadoFragment : Fragment() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resultado, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        var pontos = investidor.acumulador
        var perfil = ""

        if(pontos <= 12) {
            perfil = "CONSERVADOR"
        }else if(pontos >=13 && pontos <= 29){
            perfil = "MODERADO"
        }else if(pontos >= 30){
            perfil = "ARROJADO"
        }else{
            perfil = "Erro"
        }

        edTxtNomeResultado.setText(investidor.nome)
        edTxtPerfilResultado.setText(perfil)


        }


    }

}
