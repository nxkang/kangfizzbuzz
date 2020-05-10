package com.tw.kang;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class FizzBuzzService {


    public String say(int i) {
        List<String> result = new ArrayList<>();
        if (i % 3 == 0) {
            result.add("Fizz");
        }
        if (i % 5 == 0) {
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
