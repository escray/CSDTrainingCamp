package org.codingdojo.kata;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class Argument {
    public String rawValue;
    public String type;
    protected String label;

    public Argument(SchemaXiong schema, String label, String rawValue) {
        this.label = label.replaceFirst("-", "");
        this.rawValue = rawValue;
        this.type = schema.specOf(label).type;
    }

    public boolean isOf(String label) {
        return this.label.equals(label);
    }

    public Object value() {
        if (type.equals("boolean")) {
            return parseBoolean(rawValue);
        }
        if (type.equals("integer")) {
            return parseInt(rawValue);
        }
        if (type.equals("[string]")) {
            return rawValue.split(",");
        }
        return rawValue;

    }
}
