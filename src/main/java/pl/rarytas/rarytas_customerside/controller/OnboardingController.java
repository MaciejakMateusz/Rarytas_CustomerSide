package pl.rarytas.rarytas_customerside.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.rarytas.rarytas_customerside.service.OnboardingService;

@Controller
@RequestMapping("/")
@Slf4j
public class OnboardingController {

    private final OnboardingService onboardingService;

    public OnboardingController(OnboardingService onboardingService) {
        this.onboardingService = onboardingService;
    }

    @GetMapping("/{token}")
    public String onboarding(@PathVariable String token, HttpSession session) {
        session.setAttribute("order", onboardingService.initializeOrder(token));
        return "onboarding";
    }
}
