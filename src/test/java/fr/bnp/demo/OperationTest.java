package fr.bnp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

    Operation operation;


    @Test
    void itShouldTestAddition(){
        operation = new Operation();
        Assertions.assertEquals(10, operation.addition(4,6));
        Assertions.assertEquals(21, operation.addition(4,17));
    }

    @Test
    void itShouldTestMultiplication(){
        operation = new Operation();
        Assertions.assertEquals(24, operation.multiplication(4,6));
    }


}
