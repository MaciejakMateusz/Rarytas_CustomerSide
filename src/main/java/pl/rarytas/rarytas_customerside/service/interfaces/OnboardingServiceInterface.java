package pl.rarytas.rarytas_customerside.service.interfaces;

import pl.rarytas.rarytas_customerside.model.Order;

import java.util.Optional;

public interface OnboardingServiceInterface {

    Optional<Order> initializeOrder(String token);
}
