package pl.rarytas.rarytas_customerside.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.rarytas.rarytas_customerside.utility.TokenDecoder;

@Controller
@RequestMapping("/")
public class OnboardingController {

    @GetMapping("/{token}")
    public String onboarding(@PathVariable String token, HttpSession session) {
        return "onboarding";
    }
}
