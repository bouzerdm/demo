package fr.bnp.demo;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class LocalTemperature implements Temperature {
    @Override
    public int getTemperature() {
        return 15;
    }
}
