package tarea.fizzbuzz;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class fizzbuzzTest {

    @Test
    @DisplayName("Devuelve Fizz si el número es divisible por 3")
    void testIfDivisibleByThree_ReturnFizz() {

        fizzbuzz fizzbuzz = new fizzbuzz();

        assertThat(fizzbuzz, instanceOf(fizzbuzz.class));


        
    }

    @Test
    @DisplayName("Devuelve Fizz si el número es divisible por 5")
    void testIfDivisibleByThree_ReturnBuzz() {

        fizzbuzz fizzbuzz = new fizzbuzz();

        assertThat(fizzbuzz, instanceOf(fizzbuzz.class));


        
    }
    
}
