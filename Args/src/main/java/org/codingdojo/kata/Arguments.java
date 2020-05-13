package org.codingdojo.kata;

import java.util.ArrayList;
import java.util.List;

public class Arguments {
    private final SchemaXiong schema;
    private final String[] argumentsAsText;
    private final List<Argument> arguments;

    public Arguments(SchemaXiong schema, String[] config) {
        this.schema = schema;
        this.argumentsAsText = config;
        arguments = new ArrayList<Argument>();
        for (int i = 0; i < argumentsAsText.length ; i++) {
            String label = argumentsAsText[i];
            String rawValue = argumentsAsText[i + 1];
            arguments.add(new Argument(schema, label, rawValue));
        }
    }

    public Object valueOf(String label) {
        Argument match = arguments.stream().filter(argument -> argument.isOf(label).equals(label)).findAny().get();
        return match.value();
    }

    // 旧的不变，新的创建
    //

    public int size() {
        return arguments.size();
    }
}
