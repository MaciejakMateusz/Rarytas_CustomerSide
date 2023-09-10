package pl.rarytas.rarytas_customerside.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.rarytas.rarytas_customerside.model.Order;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.StandardCharsets;

@Component
@Slf4j
public class PostCommunicator {
    public void sendPostRequest(Order order) {
        try {
            URI url = new URI("http://localhost:8082/api/orders");
            HttpURLConnection connection = (HttpURLConnection) url.toURL().openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Set headers if needed
            connection.setRequestProperty("Content-Type", "application/json");

            // Enable input/output streams
            connection.setDoOutput(true);

            // Convert the Order object to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonOrder = objectMapper.writeValueAsString(order);

            // Write JSON data to the request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonOrder.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Get the response code
            int responseCode = connection.getResponseCode();

            System.out.println("Response Code: " + responseCode);
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

}
