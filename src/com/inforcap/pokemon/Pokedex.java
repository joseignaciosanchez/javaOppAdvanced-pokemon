package com.inforcap.pokemon;

public class Pokedex extends AbstractPokemon{
	
	@Override
	public void listPokemon() {
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(pokemonInfo(lista.get(i)));
		}
	}
	
	public static int getMyPokemons() {
		return myPokemons;
	}

	public static void setMyPokemons(int myPokemons) {
		Pokedex.myPokemons = myPokemons;
	}
}
