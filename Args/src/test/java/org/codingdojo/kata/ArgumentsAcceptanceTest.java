package org.codingdojo.kata;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArgumentsAcceptanceTest {
    @Test
    @Ignore
    public void should_be_able_to_parse_arguments() {
        // 1. create schema object from text
        String schemaAsTest = "l:boolean p:integer d:string";
        SchemaXiong schema = new SchemaXiong(schemaAsTest);

        // 2. create arguments objects from schema and string array
        String argumentsAsTest = "-l true -p 8080 -d /usr/log";
        String[] argumentsAsStrings = {"-l", "true", "-p", "8080","-d", "/urs/local"};
        Arguments arguments = new Arguments(schema, argumentsAsStrings);

        //
        assertThat(arguments.valueOf("l"), is(true));
        assertThat(arguments.valueOf("p"), is(8080));
        assertThat(arguments.valueOf("d"), is("/usr/log"));
    }
}
