package fr.bnp.demo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Operation {
    
    @Autowired
    Addition addition;

    public int addition(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        int result = 0;
        
        for (int i = 0; i < b; i++){
            result = addition.add(result, a);
        }
        return result;
    }
}
