package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzKataShould {
    @Test
    public void convertNumberDivisibleBy3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(42);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void convertNumberDivisibleBy5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(40);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void convertNumberThatContainNumber3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(23);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void convertNumberThatContainNumber5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(25);
        assertThat(result).isEqualTo("BuzzBuzz");
    }
}
