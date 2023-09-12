package pl.rarytas.rarytas_customerside.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.rarytas.rarytas_customerside.model.Order;
import pl.rarytas.rarytas_customerside.rest.RestApiCommunicator;

@Controller
@RequestMapping("/cart")
public class OrderController {

    private final RestApiCommunicator apiCommunicator;

    public OrderController(RestApiCommunicator apiCommunicator) {
        this.apiCommunicator = apiCommunicator;
    }

    @GetMapping
    public String cart(Model model, HttpSession session) {
        Order order = (Order) session.getAttribute("order");
        model.addAttribute("order", order);
        return "cart/cart";
    }

    @PostMapping
    public String sendOrder(@ModelAttribute Order order, Model model) {
        apiCommunicator.sendPostRequest(order);
        model.addAttribute("success", true);
        return "cart/cart";
    }
}
