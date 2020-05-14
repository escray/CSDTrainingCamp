public class Length {
    private int amountInInches;

    public Length(int rawAmount, Unit unit) {
        this.amountInInches = unit.getAmountInInches(rawAmount);
    }

    @Override
    public boolean equals(Object obj) {
        Length another = (Length) obj;
        return this.amountInInches == another.amountInInches;
    }
}
