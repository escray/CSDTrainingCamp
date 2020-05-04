package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_if_number_is_divided_by_3() {
        assertThat(new FizzBuzz(3).toString(), is("Fizz"));
    }

    @Test
    public void should_return_buzz_if_number_is_divided_by_5() {
        assertThat(new FizzBuzz(5).toString(), is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_number_is_divided_by_3_and_5() {
        assertThat(new FizzBuzz(15).toString(), is("FizzBuzz"));
    }

    @Test
    public void should_return_fizz_if_number_is_related_to_3() {
        assertThat(new FizzBuzz(13).toString(), is("Fizz"));
    }

    @Test
    public void should_return_buzz_if_number_is_related_to_5() {
        assertThat(new FizzBuzz(56).toString(), is("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_number_is_related_to_3_or_5() {
        assertThat(new FizzBuzz(51).toString(), is("FizzBuzz"));
        assertThat(new FizzBuzz(53).toString(), is("FizzBuzz"));
    }

    @Test
    public void should_return_raw_number_for_normal_numbers() {
        assertThat(new FizzBuzz(1).toString(), is("1"));
        assertThat(new FizzBuzz(2).toString(), is("2"));
    }
}
