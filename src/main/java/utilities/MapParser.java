package utilities;

import models.PokemonModel;

import java.util.HashMap;

public class MapParser {
    private final Logs log = new Logs();

    public HashMap<Integer, PokemonModel> getPokemonModelMap() {
        var pokemonsMap = new HashMap<Integer, PokemonModel>();
        var pokemonsList = new ExcelReader().readPokemonModelFromExcel();

        log.debug("For each of the Pokemon List");
        for (PokemonModel pokemon : pokemonsList) {
            log.debug(pokemon.getNombre());
            pokemonsMap.put(pokemon.getId(), pokemon);
        }
        return pokemonsMap;
    }
}
