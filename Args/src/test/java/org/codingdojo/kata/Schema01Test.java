package org.codingdojo.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Schema01Test {
    @Test
    void should_return_boolean_if_schema_flag_is_l() {
        assertEquals(Boolean.TRUE, new Schema01("l:bool").getValue("l", "true"));
        assertEquals(Boolean.FALSE, new Schema01("l:bool").getValue("l", "false"));
        assertEquals(Boolean.FALSE, new Schema01("l:bool").getValue("l", ""));
    }

    @Test
    void should_return_integer_if_schema_flag_is_p() {
        assertEquals(1, new Schema01("p:integer").getValue("p", "1"));
        assertEquals(0, new Schema01("p:integer").getValue("p", ""));
        assertEquals(-1, new Schema01("p:integer").getValue("p", "-1"));
    }

    @Test
    void should_return_string_if_schema_flag_is_d() {
        assertEquals("/usr/local", new Schema01("d:string").getValue("d", "/usr/local"));
        assertEquals("", new Schema01("d:string").getValue("d", ""));
    }
}
