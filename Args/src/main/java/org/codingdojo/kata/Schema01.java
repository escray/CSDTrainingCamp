package org.codingdojo.kata;

public class Schema01 {
    public Schema01(String config) {

    }

    public Object getValue(String flag, String value) {
        if (flag == "l") {
            if (value == "true") {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (flag == "p") {
            if (value.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(value);
        }
        return value;
    }
}
