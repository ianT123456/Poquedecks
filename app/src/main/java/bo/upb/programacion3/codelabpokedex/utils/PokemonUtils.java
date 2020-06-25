package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));
        pokemons.add(new Pokemon(13, "Charmeleon", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(14, "Chespin", R.drawable.chespin, "Grass"));
        pokemons.add(new Pokemon(15, "Articuno", R.drawable.articuno, "Flying/Ice"));
        pokemons.add(new Pokemon(16, "Celebi", R.drawable.celebi, "Psychic/Grass"));
        pokemons.add(new Pokemon(17, "Jolteon", R.drawable.jolteon, "Electric"));
        pokemons.add(new Pokemon(18, "Ninetales", R.drawable.ninetales, "Fire"));
        pokemons.add(new Pokemon(19, "Raichu", R.drawable.raichu, "Electric/Psychic"));
        pokemons.add(new Pokemon(20, "Steenee", R.drawable.steene, "Grass"));
        pokemons.add(new Pokemon(21, "Stuntfisk", R.drawable.stuntfisk, "Ground/Electric"));
        pokemons.add(new Pokemon(22, "Vaporeon", R.drawable.vaporeon, "Water"));
        return pokemons;
    }
}
