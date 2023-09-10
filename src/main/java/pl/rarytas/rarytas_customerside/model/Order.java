package pl.rarytas.rarytas_customerside.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Order {
    private Integer id, tableNumber, restaurantId;
    private List<OrderedItem> orderedItems;
    private String paymentMethod;
    private boolean billRequested;
    private boolean waitedCalled;
}
