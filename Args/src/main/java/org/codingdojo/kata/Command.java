package org.codingdojo.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Command {
    private String commandLine;
    Map<String, String> values;

    public Command(String commandLine) {
        values = new HashMap<>();
        ListIterator<String> cmdIterator = Arrays.asList(commandLine.split("\\s+")).listIterator();
        while (cmdIterator.hasNext()) {
            String name = cmdIterator.next().substring(1);
            if (cmdIterator.hasNext()) {
                String value = cmdIterator.next();
                if (isValue(value)) {
                    values.put(name, value);
                } else {
                    cmdIterator.previous();
                }
            }
        }
        this.commandLine = commandLine;
    }

    private boolean isValue(String value) {
        if (value.charAt(0) == '-') {
            if (value.length() > 2) {
                return true;
            }
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9') {
                return true;
            }
            return false;
        }
        return true;
    }

    public String getValue(String label) {
        return values.get(label);
    }
}
