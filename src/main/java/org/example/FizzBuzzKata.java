package org.example;

public class FizzBuzzKata {
    public String fizzBuzzKata(int number){
        String result = "";



        if(number % 3 == 0){
            result += "Fizz";
        }

        if(number % 5 == 0){
            result += "Buzz";
        }

        if(!result.equals("")){
            return result;
        }

        return String.valueOf(number);
    }
}
