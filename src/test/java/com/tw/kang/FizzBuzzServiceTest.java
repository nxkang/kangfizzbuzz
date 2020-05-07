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
}
