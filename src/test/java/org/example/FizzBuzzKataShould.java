package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzKataShould {

    @Test
    public void returnNumberSent(){
        String result = new FizzBuzzKata().fizzBuzzKata(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void returnFizzIfNumberIsDivisibleBy3(){
        String result = new FizzBuzzKata().fizzBuzzKata(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzIfNumberIsDivisibleBy5(){
        String result = new FizzBuzzKata().fizzBuzzKata(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzBuzzIfNumberIsDivisibleBy3And5(){
        String result = new FizzBuzzKata().fizzBuzzKata(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
