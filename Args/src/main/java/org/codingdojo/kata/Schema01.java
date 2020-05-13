package org.codingdojo.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema01 {
    private Map<String, String> map;
    public Schema01(String config) {
        map = new HashMap<>();
        Arrays.asList(config.split("\\s")).stream()
                .forEach( s -> {
                   String[] flag = s.split(":");
                   map.put(flag[0], flag[1]);
                });
    }

    public Object getValue(String flag, String value) {
        String type = map.get(flag);

        switch (type) {
            case "bool":
                return getBooleanValue(value);
            case "integer":
                return getIntegerValue(value);
            case "string":
            default:
                return value;
        }
    }

    private Object getBooleanValue(String value) {
        if (value != null && !value.isEmpty()) {
            return Boolean.parseBoolean(value);
        }
        return false;

//        return value != null ? Boolean.parseBoolean(value) : false;
    }

    private Object getIntegerValue(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(value);
    }
}
