package com.example.imcapp

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun dataAtualBrasil ():String {

    //obter data atual
    val hoje = LocalDate.now()

    // Determinar o formato da data brsileiro
    val formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    //converter a data para o brasil
    val hojeBrasil = hoje.format(formatoBrasil)

    return hojeBrasil
}