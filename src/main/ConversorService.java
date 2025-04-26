package main;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {

    public InfoMoeda moeda(String local) {
        URI baseUrl = URI.create("https://v6.exchangerate-api.com/v6/ebe2d0bc55993737ddd45595/latest/" + local);
        HttpClient conver = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(baseUrl)
                .build();

        try {
            HttpResponse<String> response = conver.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), InfoMoeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar os dados da API: " + e.getMessage());
        }
    }
}
