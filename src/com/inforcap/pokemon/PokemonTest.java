package com.inforcap.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokemon poke = new Pokemon("Pikachu", 100, "electrico");
		Pokemon poke2 = new Pokemon("Charizard", 100, "fuego");
		System.out.println("La cantidad de pokemones creados es: "+Pokemon.getCount());
		poke.attackPokemon(poke2);
	}

}
