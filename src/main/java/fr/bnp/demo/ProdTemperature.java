package fr.bnp.demo;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdTemperature implements Temperature {
    @Override
    public int getTemperature() {
        return 40;
    }
}
