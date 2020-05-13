package org.codingdojo.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SchemaXiong {
    private String schemaAsTest;
    private final List<ArgumentSpec> argumentSpecs;

    public SchemaXiong(String schemaAsTest) {
        this.schemaAsTest = schemaAsTest;
        String[] argSpecsAsStrings = schemaAsTest.split(" ");
        argumentSpecs = stream(argSpecsAsStrings).map(ArgumentSpec:)
        // l:boolean
        argumentSpecs = new ArrayList<>();
        for (int i = 0; i < argSpecsAsStrings.length; i++) {
            String argSpecAsString = argSpecsAsStrings[i];
            argumentSpecs.add(new ArgumentSpec(argSpecAsString));
        }
    }

    public int size() {
        return schemaAsTest.split(" ").length;
    }

    public ArgumentSpec specOf(String label) {
        Optional<ArgumentSpec> candidate = argumentSpecs.stream()
                .filter(spec -> spec.label.equals(label))
                .findAny();
        if (!candidate.isPresent()) {
            throw new UnspecifiedArgument(label);
        }
    }
}
