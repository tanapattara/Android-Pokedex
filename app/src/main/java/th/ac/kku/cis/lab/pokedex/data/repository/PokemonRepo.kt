package th.ac.kku.cis.lab.pokedex.data.repository

import th.ac.kku.cis.lab.pokedex.data.api.APIInterface

class PokemonRepo constructor(private val apiInterface: APIInterface) {
    suspend fun getPokemonList() = apiInterface.getPokemons()
    //suspend fun getPokemonInfo() = apiInterface.getPokemonInfor()
}