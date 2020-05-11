package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandTest {
    @Test
    void test_has_value() {
        Command cmd = new Command("-l true -d /usr/log -p 8080");
        assertEquals("true", cmd.getValue("l"));
        assertEquals("/usr/log", cmd.getValue("d"));
        assertEquals("8080", cmd.getValue("p"));
    }

    @Test
    void test_has_no_value() {
        Command cmd = new Command("-l -d /usr/local");
        assertNull(cmd.getValue("l"));
        assertEquals("/usr/local", cmd.getValue("d"));
    }

    @Test
    void test_has_a_negative_value() {
        Command cmd = new Command("-l -p -9 -d /usr/local");
        assertNull(cmd.getValue("l"));
        assertEquals("-9", cmd.getValue("p"));
        assertEquals("/usr/local", cmd.getValue("d"));
    }
}
