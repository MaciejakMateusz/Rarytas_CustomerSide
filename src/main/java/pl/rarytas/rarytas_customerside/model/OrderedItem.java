package pl.rarytas.rarytas_customerside.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class OrderedItem {
    private Integer itemId, quantity;
}