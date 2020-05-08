package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FiberCalculatorTest {
    @Test
    public void should_throw_exception_given_index_below_1() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(-10));
    }


    @Test
    public void should_return_1_give_index_1_or_2(){
        assertThat(FiberCalculator.calculate(1), is(1L));
        assertThat(FiberCalculator.calculate(2), is(1L));
    }

    @Test
    public void should_return_correct_number_given_index_between_3_and_50(){
        assertThat(FiberCalculator.calculate(3), is(2L));
        assertThat(FiberCalculator.calculate(5), is(5L));
        assertThat(FiberCalculator.calculate(10), is(55L));
    }

    @Test
    public void should_return_12586269025L_given_index_50() {
        assertThat(FiberCalculator.calculate(50), is(12586269025L));
    }

}
