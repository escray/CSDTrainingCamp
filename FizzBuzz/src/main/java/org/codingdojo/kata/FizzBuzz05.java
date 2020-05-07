package org.codingdojo.kata;

import static java.lang.String.valueOf;

public class FizzBuzz05 {
    private int rawNumber;

    public FizzBuzz05(int rawNumber) {

        this.rawNumber = rawNumber;
    }

    public String toString() {
        String result;
        if (isRelated(3)) {
            if (isRelated(5)) {
                result =  "fizzbuzz";
            } else {
                result =  "fizz";
            }
        } else if (isRelated(5)) {
            result =  "buzz";
        } else {
            result = valueOf(rawNumber);
        }
        return result;
    }

    private boolean isRelated(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
