package org.codingdojo.kata;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.assertj.core.api.Assertions.assertThat;

class FiberCalculatorTest {
    @Test
    void should_throw_exception_given_index_below_1() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(-10));
    }

    @Test
    void should_throw_exception_given_index_above_50() {
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(51));
        assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(100));
    }

    @Test
    void should_return_1_give_index_1_or_2(){
        assertEquals(1L, FiberCalculator.calculate(1));
        assertEquals(1L, FiberCalculator.calculate(2));
    }

    @Test
     void should_return_correct_number_given_index_between_3_and_50(){
        assertEquals(2, FiberCalculator.calculate(3));
        assertEquals(5, FiberCalculator.calculate(5));
        assertEquals(55, FiberCalculator.calculate(10));
    }

    @Test
     void should_return_12586269025L_given_index_50() {
        assertEquals(12586269025L, FiberCalculator.calculate(50));
    }

}
