package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {
    @Test
    public void testFibonacci(){
        Fibonacci fib = new Fibonacci();
        checkFib(fib, 0, 0);
        checkFib(fib, 1, 1);

        int[][] cases =  {{0,0}, {1,1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}};
        for (int i = 0; i < cases.length; i++) {
            checkFib(fib, cases[i][0], cases[i][1]);
        }
    }

    private void checkFib(Fibonacci fib, int i, int i2) {
        assertThat(fib.get(i), is(i2));
    }
}
