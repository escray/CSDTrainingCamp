package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Command01Test {
    @Test
    void should_get_value_if_label_is_normal() {
        Command01 command = new Command01("-l true -p 8080 -d /usr/local");
        assertEquals("8080", command.getValue("p"));
        assertEquals("true", command.getValue("l"));
        assertEquals("/usr/local", command.getValue("d"));
    }

    @Test
    void should_get_default_value_if_value_is_empty() {
        Command01 command = new Command01("-l -p -d");
        assertEquals("false", command.getValue("l"));
        assertEquals("0", command.getValue("p"));
        assertEquals("", command.getValue("d"));
    }

    @Test
    void should_get_negative_value_if_value_is_negative() {
        Command01 command = new Command01("-l true -p -80 -d /usr/local");
        assertEquals("-80", command.getValue("p"));
        assertEquals("true", command.getValue("l"));
        assertEquals("/usr/local", command.getValue("d"));
    }
}
