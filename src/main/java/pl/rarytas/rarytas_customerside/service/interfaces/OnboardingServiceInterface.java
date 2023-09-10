package pl.rarytas.rarytas_customerside.service.interfaces;

import pl.rarytas.rarytas_customerside.model.Order;

public interface OnboardingServiceInterface {

    Order initializeOrder(String token);
}
