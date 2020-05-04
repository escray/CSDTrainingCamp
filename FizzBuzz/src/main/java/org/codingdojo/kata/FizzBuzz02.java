package org.codingdojo.kata;

import static java.lang.String.valueOf;

public class FizzBuzz02 {
    private int rawNumber;

    public FizzBuzz02(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return valueOf(rawNumber);
    }

    private boolean isRelatedTo(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
