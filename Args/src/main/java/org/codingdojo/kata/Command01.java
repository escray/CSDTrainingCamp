package org.codingdojo.kata;

import java.util.*;

public class Command01 {
    private Map<String, String> schemaMap;
    private Map<String, String> defaultValueMap;

    public Command01(String config) {

        schemaMap = new HashMap<>();
        defaultValueMap = new HashMap<String, String>() {{
            put("l", "false");
            put("d", "");
            put("p", "0");
        }};

        ListIterator<String> cmdIterator =
                Arrays.asList(config.split("\\s+")).listIterator();
        String name;
        String value;
        String defaultValue;
        while (cmdIterator.hasNext()) {
            name = cmdIterator.next().substring(1);
            defaultValue = defaultValueMap.get(name);
            if (cmdIterator.hasNext()) {
                value = cmdIterator.next();
                if (isValue(value)) {
                    schemaMap.put(name, value);
                } else {
                    schemaMap.put(name, defaultValue);
                    cmdIterator.previous();
                }
            } else if (defaultValue != null) {
                schemaMap.put(name, defaultValue);
            }
        }
    }

    private Boolean isValue(String value) {
        if (value.startsWith("-")) {
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9') {
                return true;
            }
        }
        return !value.startsWith("-");
    }

    public String getValue(String label) {
        return schemaMap.get(label);
    }
}
