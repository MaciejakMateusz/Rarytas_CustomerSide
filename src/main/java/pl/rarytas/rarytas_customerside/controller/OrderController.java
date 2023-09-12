package pl.rarytas.rarytas_customerside.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.rarytas.rarytas_customerside.model.Order;
import pl.rarytas.rarytas_customerside.rest.RestApiCommunicator;

@RequestMapping("/cart")
public class OrderController {

    private final RestApiCommunicator apiCommunicator;

    public OrderController(RestApiCommunicator apiCommunicator) {
        this.apiCommunicator = apiCommunicator;
    }

    @GetMapping
    public String cart(@ModelAttribute Order order, Model model) {
        model.addAttribute("order", new Order());
        return "cart/cart";
    }

    @PostMapping
    public String sendOrder(@RequestParam Order order, Model model) {
        apiCommunicator.sendPostRequest(order);
        model.addAttribute("success", true);
        return "cart/cart";
    }
}
