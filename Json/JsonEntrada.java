package Json;

import java.util.List;

public class JsonEntrada {
    private String config;
    private String data;
    private List<String> text;

    public JsonEntrada() {
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public String toString() {
        return "JsonEntrada{" +
                "config='" + config + '\'' +
                ", data='" + data + '\'' +
                ", text=" + text +
                '}';
    }
}
