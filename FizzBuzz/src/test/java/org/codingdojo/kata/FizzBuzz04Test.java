package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzz04Test {
    @Test
    public void should_return_raw_number_if_normal() {
        checkFizzBuzz(1, "1");
        checkFizzBuzz(2, "2");
    }

    private void checkFizzBuzz(int i, String s) {
        assertThat(new FizzBuzz04(i).toString(), is(s));
    }

    @Test
    public void should_return_fizz_if_number_divided_by_3(){
        checkFizzBuzz(3, "Fizz");
    }

    @Test
    public void should_return_buzz_if_number_divided_by_5() {
        checkFizzBuzz(5, "Buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_number_divided_by_3_and_5() {
        checkFizzBuzz(15, "FizzBuzz");
    }

    @Test
    public void shoudl_return_fizz_if_number_related_to_3() {
        checkFizzBuzz(31, "Fizz");
    }

    @Test
    public void should_return_buzz_if_number_related_to_5() {
        checkFizzBuzz(254, "Buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_number_related_to_3_and_5() {
        checkFizzBuzz(253, "FizzBuzz");
    }

}
