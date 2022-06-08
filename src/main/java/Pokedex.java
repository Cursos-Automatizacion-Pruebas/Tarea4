import com.github.javafaker.Pokemon;
import models.PokemonModel;
import utilities.ExcelReader;

public class Pokedex {

    void imprimirPokemon(PokemonModel pokemon){
        var stringToPrint = String.format("el ID es %s, el nombre es %s , el nombre japaones es is %s ,el atk es %d" +
                        "el def es %d","el sp es %d","el spdef es %d","el crit es %d","el peso es %f" +
                        "el atrapado es %b",
                pokemon.getId(),
                pokemon.getNombre(),
                pokemon.getNombreJapones(),
                pokemon.getAtk(),
                pokemon.getDef(),
                pokemon.getSp(),
                pokemon.getSpDef(),
                pokemon.getCrit(),
                pokemon.getPeso(),
                pokemon.getAtrapado()
        );
        System.out.println(stringToPrint);
    }
    void imprimirListaPokemons(){


    }
}







