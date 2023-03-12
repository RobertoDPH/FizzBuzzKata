package org.example;

public class FizzBuzzKata {
    public String fizzBuzzKata(int number){
        String result = "";
        String numberConvertedToString = String.valueOf(number);

        if(numberConvertedToString.contains("3")){
            result += "Fizz";
        }

        if(number % 3 == 0){
            result += "Fizz";
        }

        if(numberConvertedToString.contains("5")){
            result += "Buzz";
        }

        if(number % 5 == 0 ){
            result += "Buzz";
        }

        if(!result.equals("")){
            return result;
        }

        return numberConvertedToString;
    }
}
