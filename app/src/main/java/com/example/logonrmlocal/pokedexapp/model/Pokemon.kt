package com.example.logonrmlocal.pokedexapp.model

import android.graphics.drawable.Drawable

//o data class carrega o modelo
data class Pokemon(val numero: Int,
                   val nome: String,
                   val tipo: String,
                   val descricao: String,
                   val imagem: Drawable)

//com o Adapter faz associação