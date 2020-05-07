package com.tw.kang;

public class FizzBuzzService {


    public String say(int i) {

        // 这个result有效仅当num只是一个数字的倍数
        String result = "";
        int multipleCount = 0;
        if (i % 3 == 0) {
            multipleCount += 1;
            result = "Fizz";
        }
        if (i % 5 == 0) {
            multipleCount += 1;
            result = "Buzz";
        }
        if (i % 7 == 0) {
            multipleCount += 1;
            result = "Whizz";
        }

        if (multipleCount == 1) {
            return result;
        } else if (multipleCount == 2) {
            return "FizzBuzz";
        }
        return "";
    }
}
