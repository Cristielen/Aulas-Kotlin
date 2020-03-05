package com.example.aluno.projeto01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View;
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTopo.text = "Passei pelo onCreate! Toma!"
    }

    fun clique1(v: View) {
        tvSensacional.text = tvTopo.text
    }

    fun mensagemSimples(v: View){
        val frase = etFrase.text

        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show()
    }

    fun calcular(v:View) {
        val numero = etFrase.text.toString().toInt()

        val dobro = numero * 2
        val metade = numero / 2

        val mensagem =  "O dobro é ${dobro} e a metade é ${metade}"

        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
    }

    //Crie mais 2 EditText e mais um botão
    //Crie uma função aqui e associe ao botão
    //Essa função converte em real os 2 valores das novas EditTest
    // e tenta calcular a média entre eles
    //Exiba a frase "A média dá X" no tvTopo
}
