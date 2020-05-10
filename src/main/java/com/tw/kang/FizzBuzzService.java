package com.tw.kang;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class FizzBuzzService {


    public String say(int i) {
        if (!String.valueOf(i).contains("5") && String.valueOf(i).contains("3")) {
            return "Fizz";
        }

        List<String> result = new ArrayList<>();
        if ((String.valueOf(i).contains("7") || !String.valueOf(i).contains("5"))
                && i % 3 == 0) {
            result.add("Fizz");
        }
        if (!String.valueOf(i).contains("7") && i % 5 == 0) {
            result.add("Buzz");
        }
        if (i % 7 == 0) {
            result.add("Whizz");
        }

        if (result.size() == 0) {
            return String.valueOf(i);
        } else {
            return String.join("", result);
        }
    }
}
