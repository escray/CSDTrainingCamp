import java.util.Arrays;
import java.util.List;

public class Args {
    private final List<String> strings;
    private Schema schema;

    public Args(Schema schema, String[] args) {
        this.schema = schema;
        strings = Arrays.asList(args);
    }

    public Object valueOf(String flagName) {
        Flag flag = schema.getFlag(flagName);
        return flag.getValue(valueStringOf(flag));
    }

    public String valueStringOf(Flag flag) {
        if (flag instanceof BooleanFlag) {
            return "true";
        }
        int i = strings.indexOf("-".concat(flag.getFlagName()));
        return strings.get(i+1);
    }
}
