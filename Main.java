import Json.JsonController;
import Json.JsonEntrada;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        JsonController jc = new JsonController();

        try {
            JsonEntrada je = jc.leitura();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}