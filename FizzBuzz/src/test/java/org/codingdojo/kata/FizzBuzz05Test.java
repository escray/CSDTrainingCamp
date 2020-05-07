package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzz05Test {
    @Test
    public void should_return_raw_number_if_normal() {
        checkFizzBuzz(1, "1");
        checkFizzBuzz(2, "2");
    }

    @Test
    public void should_return_fizz_if_divided_by_3() {
        checkFizzBuzz(3, "fizz");
        checkFizzBuzz(6, "fizz");
    }

    @Test
    public void should_return_buzz_if_divided_by_5() {
        checkFizzBuzz(5, "buzz");
        checkFizzBuzz(10, "buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_divided_by_3_and_5() {
        checkFizzBuzz(15, "fizzbuzz");
        checkFizzBuzz(30, "fizzbuzz");
    }

    @Test
    public void should_return_fizz_if_related_to_3() {
        checkFizzBuzz(31, "fizz");
        checkFizzBuzz(132, "fizz");
    }

    @Test
    public void should_return_buzz_if_related_to_5() {
        checkFizzBuzz(52, "buzz");
        checkFizzBuzz(151, "buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_related_to_3_and_5() {
        checkFizzBuzz(53, "fizzbuzz");
        checkFizzBuzz(150, "fizzbuzz");
    }

    private void checkFizzBuzz(int i, String fizz) {
        assertThat(new FizzBuzz05(i).toString(), is(fizz));
    }
}
