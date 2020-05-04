package org.codingdojo.kata;

import static java.lang.String.valueOf;

public class FizzBuzz01 {
    private int rawNumber;

    public FizzBuzz01(int rawNumber) {

        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelated(3) && isRelated(5)) {
            return "FizzBuzz";
        }
        if (isRelated(3)) {
            return "Fizz";
        }
        if (isRelated(5)) {
            return "Buzz";
        }
        return valueOf(rawNumber);
    }

    private boolean isRelated(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
