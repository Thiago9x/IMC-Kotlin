package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.cardview.widget.CardView

class DashBoardActivity : AppCompatActivity() {

    lateinit var dashNome:TextView
    lateinit var dashProfissao:TextView
    lateinit var dashAltura:TextView
    lateinit var card_pesar_agora:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar!!.hide()


        dashNome = findViewById(R.id.dash_nome)
        dashProfissao = findViewById(R.id.dash_profissao)
        dashAltura = findViewById(R.id.dash_altura)
        card_pesar_agora = findViewById(R.id.card_pesar_agora)

        card_pesar_agora.setOnClickListener{
            val abrirPesagem = Intent(this,Pesagem::class.java)
            startActivity(abrirPesagem)
        }

        //Carregar os dados do sharedpreferences nos campos do dashboard
        //abrir o arquivo cadastro
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        //pegar os dados do arquivo
        dashNome.text = arquivo.getString("nome", "")
        dashProfissao.text = arquivo.getString("profissao", "")
        dashAltura.text = arquivo.getFloat("altura", 0.0f).toString()
    }


}