package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonController {
    private Gson gson;

    public JsonController() {
    }

    public JsonEntrada leitura(String path) throws IOException {
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();

        JsonEntrada input = gson1.fromJson(new FileReader(path), JsonEntrada.class);



        return input;
    }

    public void escrita(List lista){

        gson = new GsonBuilder().setPrettyPrinting().create();
        // https://www.baeldung.com/java-write-to-file
    }
}
