import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public Double convertir(String moneda1, String moneda2) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/cd08072edf50aeac9118364d/latest/" + moneda1);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Conversiones conversiones = new Gson().fromJson(response.body(), Conversiones.class);

            return conversiones.monedas().get(moneda2);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error, no se encontró el tipo de moneda.");
        }
    }
}