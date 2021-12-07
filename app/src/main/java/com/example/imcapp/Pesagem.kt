package com.example.imcapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate

class Pesagem : AppCompatActivity() {

    lateinit var tv_data_ultima_pesagem: TextView
    lateinit var sppinner: Spinner
    lateinit var et_novo_peso: EditText
    lateinit var buttonRegistrarPeso : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pesagem2_activity)

        et_novo_peso = findViewById(R.id.et_novo_peso)
        tv_data_ultima_pesagem = findViewById(R.id.tv_data_ultima_pesagem)
        sppinner = findViewById(R.id.spinner)
        buttonRegistrarPeso = findViewById(R.id.button2)

        supportActionBar!!.hide()

        tv_data_ultima_pesagem.text = dataAtualBrasil()
    }
}

buttonRegistrarPeso.setOnClickListener{
    registrarPeso()
}
private fun registrarPeso(){
    val cadastro = getSharedPreferences("cadastro", dataAtualBrasil())
    val editor = cadastro.edit()

    editor.putInt("nivel", spinner.seletedItemPosition)
    editor.putString("data_ultima_pesagem", dataAtualBrasil())
    editor.putString("peso", et_novo_peso.text.toString())

    editor.commit()
    Toast.makeText(this,"Peso gravado com sucesso",Toast.LENGTH_SHORT).show()
    finish()
}