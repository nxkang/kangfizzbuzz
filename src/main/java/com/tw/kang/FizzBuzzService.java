package com.tw.kang;

public class FizzBuzzService {


    public String say(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 7 == 0) {
            return "Whizz";
        }
        return "";
    }
}
