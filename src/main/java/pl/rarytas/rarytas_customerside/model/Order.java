package pl.rarytas.rarytas_customerside.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private Integer id, tableNumber, restaurantId;
    private List<OrderedItem> orderedItems;
    private String paymentMethod;
    private boolean billRequested;
    private boolean waitedCalled;
}
