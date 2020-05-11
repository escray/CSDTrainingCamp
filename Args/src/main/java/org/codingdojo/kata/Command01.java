package org.codingdojo.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Command01 {
    HashMap<String, String> schemaMap;

    public Command01(String config) {
        schemaMap = new HashMap<>();

        List<String> params = Arrays.asList(config.split(" "));
        String val = "";

        for (int i = 0; i < params.size(); i++) {
            String label = params.get(i);
            String value = "";
            if (i + 1 < params.size()) {
                value = params.get(i + 1);
            }
            if (label.equals("-l")) {
                val = "false";
                if (isValue(value)) {
                    val = value;
                    i++;
                }
            }
            else if (label.equals("-p")) {
                val = "0";
                if (isValue(value)) {
                    val = value;
                    i++;
                }
            }
            else if (label.equals("-d")) {
                val = "";
                if (isValue(value)) {
                    val = value;
                    i++;
                }
            }
            schemaMap.put(label.substring(1), val);
        }
    }

    private boolean isValue(String value) {
        if (value.startsWith("-")) {
            if (value.charAt(1) >= '0' && value.charAt(1) <= '9') {
                return true;
            }
        }
        return !value.startsWith("-");
    }


    public String getValue(String label) {
        if (label == "p") {
            return schemaMap.get("p");
        } else if (label == "l") {
            return schemaMap.get("l");
        } else if (label == "d") {
            return schemaMap.get("d");
        }
        return "";
    }
}
