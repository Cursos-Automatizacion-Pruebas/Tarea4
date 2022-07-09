import models.MaestroPokemonModel;
import models.PokemonModel;
import utilities.ExcelReader;
import utilities.Logs;
import utilities.MapParser;

import java.util.Scanner;

public class Main {
    private static final Logs log = new Logs();

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Please enter the pokemon id: ");
        var id = scanner.nextInt();

        System.out.print("Ingresar true/false para ver la lista de pokemones atrapados: ");
        var atrapado = scanner.nextBoolean();

        scanner.close();

        log.debug("Obtener Mapa de Pokemon");
        var mapParser = new MapParser();
        var pokemonsMap = mapParser.getPokemonModelMap();

        log.debug("Se imprime el maestro pokemon");
        var maestro = new MaestroPokemonModel();

        System.out.println("Maestro Pokemon: ");
        System.out.println("Nombre: " + maestro.getNombre() + "\n" +
                "Apellido: " + maestro.getApellido() + "\n" +
                "Edad: " + maestro.getEdad() + "\n" +
                "Peso: " + maestro.getPeso() + "\n" +
                "Pais: " + maestro.getPais() + "\n" +
                "Email: " + maestro.getEmail() + "\n" +
                "Es Hombre: " + maestro.isEsHombre());

        System.out.println();

        log.debug("Buscar Pokemon");
        var idPokemonEncontrado=Pokedex.quienEsEsePokemon(id);

        System.out.println("Datos del pokemon");
        Pokedex.imprimirPokemon(pokemonsMap.get(id));

        System.out.println();
        if (atrapado) {
            System.out.println("Se imprime los pokemones atrapados");
            Pokedex.imprimirListaPokemons();
        } else {
            System.out.println("ok hasta luego entrenador");
        }
    }
}
