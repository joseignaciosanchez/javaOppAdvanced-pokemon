package com.inforcap.pokemon;

public class PokedexTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon poke1 = pokedex.createPokemon("charmander", 100, "fuego");
		Pokemon poke2 = pokedex.createPokemon("squirtle", 100, "agua");
		
		pokedex.pokemonInfo(poke1);
		pokedex.pokemonInfo(poke2);
		
		System.out.println("La cantidad de pokemones creados es: "+Pokemon.getCount());
		poke1.attackPokemon(poke2);
		
		pokedex.pokemonInfo(poke1);
		pokedex.pokemonInfo(poke2);
		
		System.out.println("El número de creado de pokemones es: "+Pokedex.getMyPokemons());		
		pokedex.listPokemon();
		
	}

}
