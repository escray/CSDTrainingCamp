package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgsTest {
    String argsStr3 = "-l -p 8080 -d /usr/logs";
    String argsStr2 = "-p 8080 -d /usr/logs";
    Args argsThree = new Args(argsStr3);
    Args argsTwo = new Args(argsStr2);

    @Test
    void should_return_args_count() {
        assertEquals(3, argsThree.argsCount());
        assertEquals(2, argsTwo.argsCount());
    }

    @Test
    void should_return_args_pair() {
        assertEquals(3, argsThree.pair.size());
        assertEquals(2, argsTwo.pair.size());
    }

    @Test
    void should_return_default_true_if_input_l_but_no_value() {
        assertEquals(true, argsThree.get("log"));
    }
}
