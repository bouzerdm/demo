package fr.bnp.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void itShouldSuccess(){
        Assertions.assertEquals(10, 5 + 5);
    }

}
