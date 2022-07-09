package utilities;

import com.poiji.bind.Poiji;
import models.PokemonModel;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final String excelPath = "src/test/resources/pokemonList.xlsx";
    private final Logs log = new Logs();

    public List<PokemonModel> readPokemonModelFromExcel() {
        log.debug("Reading pokemon from excel");
        return Poiji.fromExcel(new File(excelPath), PokemonModel.class);
    }
}
