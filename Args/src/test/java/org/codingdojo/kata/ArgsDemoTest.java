package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: 2020/5/9
// Schema 解析
// > Bool
// > String
// > int
// Command 解析
// > normal
// > empty
// > negative
// 实现 Args

public class ArgsDemoTest {
    @Test
    void test_with_normal() {
        ArgsDemo args = new ArgsDemo("l:bool,d:string,p:int", "-l true -d /usr/local -p 8080");
        assertEquals(Boolean.TRUE, args.getValue("l"));
        assertEquals("/usr/local", args.getValue("d"));
        assertEquals(8080, args.getValue("p"));
    }

    @Test
    void test_with_number() {
        ArgsDemo args = new ArgsDemo("l:bool,d:string,p:int", "-l -p -9 -d /usr/local");
        assertEquals(Boolean.FALSE, args.getValue("l"));
        assertEquals("/usr/local", args.getValue("d"));
        assertEquals(-9, args.getValue("p"));
    }
}
