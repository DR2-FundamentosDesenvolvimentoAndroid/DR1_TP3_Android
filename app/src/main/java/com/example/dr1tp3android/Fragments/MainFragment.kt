package com.example.dr1tp3android.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.dr1tp3android.PerguntasActivity
import com.example.dr1tp3android.R
import com.example.dr1tp3android.ViewModel.InvestidorViewModel
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    private lateinit var investidor: InvestidorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            investidor = ViewModelProviders.of(it).get(InvestidorViewModel::class.java)
        }

        btnIniciar.setOnClickListener{
            investidor.nome = txtResultado.text.toString()

            if(investidor.nome == ""){
                Toast.makeText(activity, "ERRO: Digite seu nome por favor!",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(activity, PerguntasActivity::class.java)
//                intent.putExtra("nome", investidor.nome)
                startActivity(intent)

            }
        }


    }


}
