package com.example.logonrmlocal.pokedexapp

//shift f6 altera uma variável em todos os pontos

// no onBindViewHolder vc associa cada característica de cada item
//no View Holder() faz a união das imagens

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.logonrmlocal.pokedexapp.model.Pokemon
import kotlinx.android.synthetic.main.pokemon_item.view.*

class ListaPokemonAdapter(private val pokemons: List<Pokemon>,
                          private val context: Context,
                          val listener: (Pokemon) -> Unit) : Adapter<ListaPokemonAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokemons[position]
        holder?.let {
            it.bindView(pokemon, listener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(pokemon: Pokemon,
                     listener: (Pokemon) -> Unit) = with(itemView) {

            ivPokemon.setImageDrawable(pokemon.imagem)
            tvNomePokemon.text = pokemon.nome
            tvTipoPokemon.text = pokemon.tipo
            tvDescricaoPokemon.text = pokemon.descricao

            setOnClickListener { listener(pokemon) }
        }
    }
}