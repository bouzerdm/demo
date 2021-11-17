package fr.bnp.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Operation {

    Addition addition;

    public int addition(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        int result = 0;

        for (int i = 0; i < b; i++) {
            result = addition.add(result, a);
        }
        return result;
    }
}
