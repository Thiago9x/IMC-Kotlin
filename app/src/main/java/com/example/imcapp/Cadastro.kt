package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText

class Cadastro : AppCompatActivity() {

    lateinit var editEmail : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        editEmail = findViewById(R.id.edit_novo_email)
//        supportActionBar!!.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cadastro,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Salvar os dados do usuario em um sharedPreferences
        // Criar um arquivo sharedPreferences
        //Se o arquivo existir o arquivo sera aberto
        val dados = getSharedPreferences("cadastro", MODE_PRIVATE)
        // criar um editor para o arquivo
        val editor = dados.edit()
        editor.putString("email",editEmail.text.toString())
        return true
    }
}
