package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editEmail : EditText
    lateinit var editSenha : EditText
    lateinit var btnEntrar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //excluir a toolbar
        supportActionBar!!.hide()

        editEmail = findViewById(R.id.edit_login_email)
        editSenha = findViewById(R.id.edit_login_senha)
        btnEntrar = findViewById(R.id.entrar)

        btnEntrar.setOnClickListener{
            login()
        }

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

    private fun login() {
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        val emailDigitado = editEmail.text.toString()
        val senhaDigitado = editSenha.text.toString()

        val email = arquivo.getString("email", "")
        val senha = arquivo.getString("senha", "")

        if(emailDigitado == email && senhaDigitado == senha){
            val intent = Intent(this, DashBoardActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Usuario ou senha incorretos!", Toast.LENGTH_SHORT).show()
        }
    }


}
