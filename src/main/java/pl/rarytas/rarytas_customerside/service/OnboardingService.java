package pl.rarytas.rarytas_customerside.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.rarytas.rarytas_customerside.service.interfaces.OnboardingServiceInterface;
import pl.rarytas.rarytas_customerside.utility.TokenDecoder;

@Service
@Slf4j
public class OnboardingService implements OnboardingServiceInterface {

    private final TokenDecoder tokenDecoder;

    public OnboardingService(TokenDecoder tokenDecoder) {
        this.tokenDecoder = tokenDecoder;
    }

    @Override
    public Integer[] getIdParams(String token) {
        return tokenDecoder.decode(token);
    }

}
