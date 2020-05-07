package org.codingdojo.kata;

public class Inch{
    private final int amount;
    public int inchCount;

    public Inch(int amount) {
        this.amount = amount;
        inchCount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Inch another = (Inch) obj;
        return this.amount == another.amount;
    }
}
