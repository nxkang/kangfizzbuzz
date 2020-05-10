package com.tw.kang;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzServiceTest {

    private FizzBuzzService service = new FizzBuzzService();

    @Test
    public void given_3_mulriple_when_say_then_return_fizz() {
        assertThat(service.say(3), equalTo("Fizz"));
        assertThat(service.say(6), equalTo("Fizz"));
        assertThat(service.say(9), equalTo("Fizz"));
    }

    @Test
    public void given_5_mulriple_when_say_then_return_Buzz() {
        assertThat(service.say(5), equalTo("Buzz"));
        assertThat(service.say(10), equalTo("Buzz"));
        assertThat(service.say(20), equalTo("Buzz"));
    }

    @Test
    public void given_7_mulriple_when_say_then_return_Whizz() {
        assertThat(service.say(7), equalTo("Whizz"));
        assertThat(service.say(14), equalTo("Whizz"));
        assertThat(service.say(28), equalTo("Whizz"));
    }

    @Test
    public void given_any_two_special_num_mulriple_when_say_then_return_FizzBuzz() {
        // 3, 5
        assertThat(service.say(60), equalTo("FizzBuzz"));
        // 3, 7
        assertThat(service.say(21), equalTo("FizzWhizz"));
        // (5, 7) *2
        assertThat(service.say(70), equalTo("BuzzWhizz"));
    }

    @Test
    public void given_any_three_special_num_mulriple_when_say_then_return_FizzBuzz() {
        // 2*3*5*7
        assertThat(service.say(210), equalTo("FizzBuzzWhizz"));
        // 4*3*5*7
        assertThat(service.say(420), equalTo("FizzBuzzWhizz"));
    }

    @Test
    public void given_ordinary_num_when_say_then_return_itself() {
        assertThat(service.say(2), equalTo("2"));
        assertThat(service.say(122), equalTo("122"));
        assertThat(service.say(542), equalTo("542"));
    }

    @Test
    public void given_num_contains_3_when_say_then_return_Fizz() {
        assertThat(service.say(13), equalTo("Fizz"));
    }

    @Test
    public void given_num_contains_5_when_say_then_return_BuzzWhizz() {
        // 3, 5
        assertThat(service.say(15), equalTo("Buzz"));
        // 3*5*7
        assertThat(service.say(105), equalTo("BuzzWhizz"));
        assertThat(service.say(35), equalTo("BuzzWhizz"));
        assertThat(service.say(105), equalTo("BuzzWhizz"));
    }
}
