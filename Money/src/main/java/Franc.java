public class Franc {

    int amount;

    public Franc(int amount) {

        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc)obj;
        return this.amount == franc.amount;

    }
}
