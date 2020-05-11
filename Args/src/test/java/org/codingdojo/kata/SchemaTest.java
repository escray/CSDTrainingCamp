package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchemaTest {
    @Test
    void test_bool() {
        Schema schema = new Schema("l:bool");
        assertEquals(Boolean.TRUE, schema.getValue("l", "true"));
        assertEquals(Boolean.FALSE, schema.getValue("l", "false"));
        assertEquals(Boolean.FALSE, schema.getValue("l", ""));
    }

    @Test
    void test_integer() {
        Schema schema = new Schema("p:int");
        assertEquals(1, schema.getValue("l", "1"));
    }

    @Test
    void test_string() {
        Schema schema = new Schema("l:str");
        assertEquals("hello", schema.getValue("l", "hello"));
    }
}
