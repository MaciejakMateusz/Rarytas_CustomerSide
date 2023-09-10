package pl.rarytas.rarytas_customerside.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.rarytas.rarytas_customerside.model.Order;
import pl.rarytas.rarytas_customerside.service.interfaces.OnboardingServiceInterface;

import java.util.Base64;

@Service
@Slf4j
public class OnboardingService implements OnboardingServiceInterface {

    @Override
    public Order initializeOrder(String token) {
        // Decode the Base64 encoded string
        byte[] decodedBytes = Base64.getDecoder().decode(token.getBytes());
        String decodedString = new String(decodedBytes);

        // Split the combined IDs using the delimiter
        String[] ids = decodedString.split("-");

        Order order = new Order();
        order.setTableNumber(Integer.parseInt(ids[0]));
        order.setRestaurantId(Integer.parseInt(ids[1]));

        return order;
    }

}
