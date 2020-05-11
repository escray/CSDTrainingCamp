package org.codingdojo.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema {
    Map<String, String> schemaMap;
    public Schema(String config) {
        schemaMap = new HashMap<>();
        Arrays.asList(config.split(","))
                .stream()
                .forEach(flag -> {
                    String[] nameValue = flag.split(":");
                    schemaMap.put(nameValue[0], nameValue[1]);
                });
    }

    public Object getValue(String name, String strValue) {
       String type = schemaMap.get(name);
       switch (type) {
           case "bool":
               return "true".equalsIgnoreCase(strValue);
           case "int":
               return Integer.parseInt(strValue);
           default:
               return strValue;
       }

    }
}
