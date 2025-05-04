import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class Conn {
    public Conn() {
    }
    Double resquest(String moeda1, String moeda2) throws IOException, InterruptedException {
        String busca = "https://v6.exchangerate-api.com/v6/7aa81791c5c353e67a1b5de0/latest/" + moeda1;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        HashMap<String, Object> map = new Gson().fromJson(json, HashMap.class);
        Object values = map.get("conversion_rates");

        JsonElement convertionRates = new Gson().toJsonTree(values);
        HashMap<String, Object> map2 = new Gson().fromJson(convertionRates, HashMap.class);

        return (Double) map2.get(moeda2);
    }
}
