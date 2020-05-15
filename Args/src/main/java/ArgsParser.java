public class ArgsParser {
    private final Schema schema;
    private Args args;

    public ArgsParser(String schemaAsString) {
        schema = new Schema(schemaAsString);
    }

    public void parse(String[] args) {
        this.args = new Args(schema, args);
    }

    public Object getValue(String flagName) {
        return args.valueOf(flagName);
    }
}
