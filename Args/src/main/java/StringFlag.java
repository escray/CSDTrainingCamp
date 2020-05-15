public class StringFlag extends Flag {
    public StringFlag(String flagName) {
        super(flagName);
    }

    @Override
    public Object getValue(String valueAsString) {
        return valueAsString;
    }
}
