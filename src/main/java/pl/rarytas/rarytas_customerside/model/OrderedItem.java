package pl.rarytas.rarytas_customerside.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderedItem {
    private Integer itemId, quantity;
}
