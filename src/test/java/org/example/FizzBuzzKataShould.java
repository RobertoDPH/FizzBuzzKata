package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzKataShould {

    @Test
    public void returnNumberSent(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void returnFizzIfNumberIsDivisibleBy3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(12);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzIfNumberIsDivisibleBy5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(40);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzBuzzIfNumberIsDivisibleBy3And5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(60);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnFizzIfNumberContainsNumber3OrIsDivisibleBy3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(13);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void returnFizzIfNumberContainsNumber5OrIsDivisibleBy5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(40);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzFizzIfNumberContainsNumber3AndIsDivisibleBy3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(33);
        assertThat(result).isEqualTo("FizzFizz");
    }

    @Test
    public void returnBuzzBuzzIfNumberContainsNumber5AndIsDivisibleBy5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(55);
        assertThat(result).isEqualTo("BuzzBuzz");
    }

    @Test
    public void returnBuzzBuzzIfNumberContainsNumber5And3(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(53);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnFizzBuzzBuzzIfNumberContainsNumber3And5AndIsDivisibleBy5(){
        String result = new FizzBuzzKata().checkFizzBuzzNumber(35);
        assertThat(result).isEqualTo("FizzBuzzBuzz");
    }
}
