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
        String result = new FizzBuzzKata().fizzBuzzKata(12);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzIfNumberIsDivisibleBy5(){
        String result = new FizzBuzzKata().fizzBuzzKata(40);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzBuzzIfNumberIsDivisibleBy3And5(){
        String result = new FizzBuzzKata().fizzBuzzKata(60);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnFizzIfNumberContainsNumber3OrIsDivisibleBy3(){
        String result = new FizzBuzzKata().fizzBuzzKata(13);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnFizzIfNumberContainsNumber5OrIsDivisibleBy5(){
        String result = new FizzBuzzKata().fizzBuzzKata(40);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzFizzIfNumberContainsNumber3AndIsDivisibleBy3(){
        String result = new FizzBuzzKata().fizzBuzzKata(33);
        assertThat(result).isEqualTo("FizzFizz");
    }

    @Test
    public void returnBuzzBuzzIfNumberContainsNumber5AndIsDivisibleBy5(){
        String result = new FizzBuzzKata().fizzBuzzKata(55);
        assertThat(result).isEqualTo("BuzzBuzz");
    }

    @Test
    public void returnFizzBuzzBuzzIfNumberContainsNumber3And5AndIsDivisibleBy5(){
        String result = new FizzBuzzKata().fizzBuzzKata(35);
        assertThat(result).isEqualTo("FizzBuzzBuzz");
    }
}
