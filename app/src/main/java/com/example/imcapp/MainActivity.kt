package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //excluir a toolbar
        supportActionBar!!.hide()

        //instanciar o botao criar conta
        val botaoNovoUsuario = findViewById<Button>(R.id.btn_criar_conta)

        //Criar um listener/ouvinte
        botaoNovoUsuario.setOnClickListener {
        //criar uma intent
           // val x = "10"
            val abrirCadastro = Intent(this, Cadastro::class.java)
            startActivity(abrirCadastro)
        }
    }


}
