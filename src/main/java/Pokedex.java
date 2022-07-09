import models.PokemonModel;
import utilities.ExcelReader;
import utilities.Logs;
import utilities.MapParser;

public class Pokedex {
    private static final Logs log = new Logs();

    static void imprimirPokemon(PokemonModel pokemon) {
        System.out.println(
                "ID:" + pokemon.getId() + "\n" +
                        "NOMBRE: " + pokemon.getNombre() + "\n" +
                        "NOMBRE JAPONES: " + pokemon.getNombreJapones() + "\n" +
                        "ATK: " + pokemon.getAtk() + "\n" +
                        "DEF: " + pokemon.getDef() + "\n" +
                        "SP: " + pokemon.getSp() + "\n" +
                        "SPDEF: " + pokemon.getSpDef() + "\n" +
                        "CRIT: " + pokemon.getCrit() + "\n" +
                        "PESO: " + pokemon.getPeso() + "\n" +
                        "ATRAPADO:" + pokemon.getAtrapado());
    }

    static void imprimirListaPokemons() {
        var excelReader = new ExcelReader();
        var pokemonsList = excelReader.readPokemonModelFromExcel();
        for (PokemonModel pokemonls : pokemonsList) {
            if (pokemonls.getAtrapado()) {
                imprimirPokemon(pokemonls);
            }
        }
    }

    static String quienEsEsePokemon(int id) {
        log.debug("obtenemos el ID");
        var mapParser = new MapParser();
        var pokemonsMap = mapParser.getPokemonModelMap();
        return pokemonsMap.get(id).toString();
    }
}







