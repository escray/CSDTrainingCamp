package org.codingdojo.kata;

import static java.lang.String.valueOf;

public class FizzBuzz06 {
    private int rawNumber;

    public FizzBuzz06(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    public String toString() {
        if (isDividedBy(3) && isDividedBy(5)) {
            return "fizzbuzz";
        }
        if (isDividedBy(3)) {
            return "fizz";
        }
        if (isDividedBy(5)) {
            return "buzz";
        }
        return valueOf(rawNumber);
    }

    private boolean isDividedBy(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
