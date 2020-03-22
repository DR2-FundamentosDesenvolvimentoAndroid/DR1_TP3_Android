package com.example.dr1tp3android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAnalisar.setOnClickListener{
            val nome = edTxtNome.text.toString()

            if(nome.isEmpty()){
                Toast.makeText(this, "ERRO: Digite seu nome por favor!", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, PerguntasActivity::class.java)
                intent.putExtra("nome", nome)
                startActivity(intent)
            }
        }
    }

}
