package fr.bnp.demo;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public Player renderResult() {
        return Player.builder()
                .nom("nom")
                .prenom("prenom")
                .build();
    }
}
