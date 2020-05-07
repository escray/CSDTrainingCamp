package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzz06Test {
    @Test
    public void should_return_raw_number_if_normal() {
        checkFizzBuzz(1, "1");
        checkFizzBuzz(2, "2");
    }

    @Test
    public void should_return_fizz_if_is_divided_by_3() {
        checkFizzBuzz(3, "fizz");
        checkFizzBuzz(6, "fizz");
    }

    @Test
    public void should_return_buzz_if_is_divided_by_5() {
        checkFizzBuzz(5, "buzz");
        checkFizzBuzz(50, "buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_is_divided_by_3_and_5() {
        checkFizzBuzz(15, "fizzbuzz");
        checkFizzBuzz(30, "fizzbuzz");
    }

    @Test
    public void should_return_fizzbuzz_if_is_related_to_3_and_5() {
        checkFizzBuzz(35, "fizzbuzz");
        checkFizzBuzz(351, "fizzbuzz");
    }

    private void checkFizzBuzz(int i, String fizz) {
        assertThat(new FizzBuzz06(i).toString(), is(fizz));
    }
}
