package pl.rarytas.rarytas_customerside.utility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class TokenDecoder {
    public Integer[] decode(String token) {
        try {
            // Convert the token string back to a UUID
            UUID uuid = UUID.fromString(token);

            // Get the byte representation of the UUID
            byte[] uuidBytes = new byte[16];
            long mostSigBits = uuid.getMostSignificantBits();
            long leastSigBits = uuid.getLeastSignificantBits();
            for (int i = 0; i < 8; i++) {
                uuidBytes[i] = (byte) ((mostSigBits >>> (8 * (7 - i))) & 0xFF);
                uuidBytes[i + 8] = (byte) ((leastSigBits >>> (8 * (7 - i))) & 0xFF);
            }

            // Convert the UUID bytes back to the original input string
            String inputString = new String(uuidBytes);

            // Split the input string to retrieve the tableId and restaurantId
            String[] parts = inputString.split(":");
            if (parts.length == 2) {
                int tableId = Integer.parseInt(parts[0]);
                int restaurantId = Integer.parseInt(parts[1]);

                // Create an Integer array and return the IDs
                return new Integer[]{ tableId, restaurantId };
            } else {
                log.warn("Invalid token format.");
            }
        } catch (IllegalArgumentException e) {
            log.warn("Invalid token format. " + e);
        }

        return null; // Return null in case of failure
    }

}