package org.codingdojo.kata;

public class FiberCalculator {
    public static long calculate(int index) {
        if (index < 1 || index > 50) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            return 1L;
        }

        long first = 1;
        long second = 1;
        long temp;
        for (int i = 3; i <= index; i++) {
            temp = first;
            first = second;
            second = temp + second;
        }
        return second;
    }
}
