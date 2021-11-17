package fr.bnp.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Addition {

    public int add(Integer a, Integer b) {
        return a + b;
    }
}
