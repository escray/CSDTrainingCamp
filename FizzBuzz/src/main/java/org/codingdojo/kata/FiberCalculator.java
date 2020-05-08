package org.codingdojo.kata;

public class FiberCalculator {
    public static long calculate(int index) {
        if (index < 1) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            return 1L;
        }
        return calculate(index - 2) + calculate(index - 1);
    }
}
