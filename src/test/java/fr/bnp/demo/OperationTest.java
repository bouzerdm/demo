package fr.bnp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OperationTest {

    @InjectMocks
    Operation operation;

    @Mock
    Addition addition;

    @BeforeAll
    public static void init(){
        System.out.println("je suis passé par la");
    }

    @Test
    void itShouldTestMultiplication() {
        when(addition.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(8);
        Assertions.assertEquals(8, operation.multiplication(4, 2));
    }


}
