import Json.JsonController;
import Json.JsonEntrada;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        JsonController jc = new JsonController();
        String path = "Json/exemplos.input.json";      //path aqui

        try {
            JsonEntrada je = jc.leitura(path);
            //System.out.println(je);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //catch (NoSuchFileException)
    }
}