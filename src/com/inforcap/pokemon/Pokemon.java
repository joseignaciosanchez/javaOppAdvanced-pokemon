package com.inforcap.pokemon;

public class Pokemon implements PokemonInterface{
	
	protected String name;
	protected int health;
	protected String type;
	
	private static int count = 0;	
		
	public Pokemon(String nomPokemon, int saludPokemon, String typePokemon) {
		
		this.name = nomPokemon;
		this.health = saludPokemon;
		this.type = typePokemon;
		
		count++;
	}

	public void attackPokemon(Pokemon pokemon) {
		int daño = 10;
		pokemon.health -= daño;
		System.out.println("El pokemon "+pokemon.getName()+" ha sido atacado y queda con "+pokemon.getHealth()+" puntos de vida...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		return null;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listPokemon() {
		// TODO Auto-generated method stub
		
	}

}
