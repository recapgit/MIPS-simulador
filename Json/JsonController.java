package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonController {
    private Gson gson;
    private String path;     //path aqui

    public JsonController() {
    }

    public JsonEntrada leitura() throws IOException {
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();

        BufferedReader br = Files.newBufferedReader(Paths.get(path));

        //nao sei como funciona mas funciona 👍
        JsonEntrada input = gson.fromJson(br, JsonEntrada.class);

        return input;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void escrita(List lista){

        gson = new GsonBuilder().setPrettyPrinting().create();
        // https://www.baeldung.com/java-write-to-file
    }
}
