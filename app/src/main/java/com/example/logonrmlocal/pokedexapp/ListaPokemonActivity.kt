package com.example.logonrmlocal.pokedexapp

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.logonrmlocal.pokedexapp.model.Pokemon
import kotlinx.android.synthetic.main.activity_list.*

class ListaPokemonActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //quando clicar num dos itens, vai abrir uma mensagem
        rvPokemons.adapter = ListaPokemonAdapter(
                listaPokemons(),
                this, {
            Toast.makeText(this,
                    it.nome, Toast.LENGTH_LONG).show()
        })
        val layoutManager = LinearLayoutManager(this)
        rvPokemons.layoutManager = layoutManager
    }

    //o que aparece na lista
    private fun listaPokemons(): List<Pokemon> {
        return listOf(
                getIvysaur(),
                getIvysaur(),
                getIvysaur(),
                getIvysaur()
        )
    }

    private fun getIvysaur(): Pokemon {
        return Pokemon(150, "Ivysaur", "Genetic",
                "Bla bla bla",
                ContextCompat.getDrawable(this, R.drawable.ivysaur)!!)
    }
}
