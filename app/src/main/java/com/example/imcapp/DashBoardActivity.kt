package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class DashBoardActivity : AppCompatActivity() {

    lateinit var dashNome:TextView
    lateinit var dashProfissao:TextView
    lateinit var dashAltura:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        supportActionBar!!.hide()


        dashNome = findViewById(R.id.dash_nome)
        dashProfissao = findViewById(R.id.dash_profissao)
        dashAltura = findViewById(R.id.dash_altura)

        //Carregar os dados do sharedpreferences nos campos do dashboard
        //abrir o arquivo cadastro
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        //pegar os dados do arquivo
        dashNome.text = arquivo.getString("nome", "")
        dashProfissao.text = arquivo.getString("profissao", "")
        dashAltura.text = arquivo.getFloat("altura", 0.0f).toString()
    }


}