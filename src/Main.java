import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
    URL url = new URL("https://api.api-ninjas.com/v1/exercises?muscle=biceps");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestProperty("accept", "application/json");
    InputStream responseStream = connection.getInputStream();
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(responseStream);
    System.out.println(root.path("fact").asText());

    public static void main(String[] args) {

    }
}
