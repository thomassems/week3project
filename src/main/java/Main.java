//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class Main {
//    URL url = new URL("https://api.api-ninjas.com/v1/exercises?muscle=biceps");
//    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//    connection.setRequestProperty("Accept", "application/json");
//    InputStream responseStream = connection.getInputStream();
//    ObjectMapper mapper = new ObjectMapper();
//    JsonNode root = mapper.readTree(responseStream);
//    System.out.println(root.path("fact").asText());
//
//    public static void main(String[] args) {
//
//    }
//}

// tjZ3LgBnocuKxzqJDIP8aQ==U01N8LuUqrlVhiNR

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String apiKey = "KE8a7QjrGwSZ2jx3+4URNg==aPNxCl8ULpu4Trvb"; // Replace with your actual API key

        URL url = new URL("https://api.api-ninjas.com/v1/exercises?muscle=biceps");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Accept", "application/json");
        connection.addRequestProperty("X-Api-Key", apiKey);
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(responseStream);
        System.out.println(root);
    }
}