package fr.bnp.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Addition {
    
    public int add(int a, int b){
        return a + b;
    }
}
