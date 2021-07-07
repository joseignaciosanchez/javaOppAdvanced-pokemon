package com.inforcap.pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface{
	
	public ArrayList<Pokemon> lista = new ArrayList<Pokemon>();
	public static int myPokemons = 0;
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		
		Pokemon poke = new Pokemon(name, health, type);
		lista.add(poke);
		myPokemons++;
		return poke;
	}
	
	@Override
	public String pokemonInfo(Pokemon pokemon) {
		
		return pokemon.getName()+", "+pokemon.getHealth()+", "+pokemon.getType();
	}

}
