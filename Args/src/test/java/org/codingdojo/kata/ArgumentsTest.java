package org.codingdojo.kata;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArgumentsTest {
    @Test
    void should_create_arguments() {
        String schemaAsText = "l:boolean p:integer d:string";
        SchemaXiong schema = new SchemaXiong(schemaAsText);
        String[] argumentsAsStrings = {"-l", "true", "-p", "8080", "-d", "/usr/lcoal"};

        Arguments arguments = new Arguments(schema, argumentsAsStrings);

        assertThat(arguments.size(), is(3));
    }

    @Test
    void should_retrieve_argument_value() {
        assertThat(arguments.valueOf("d"), is("/usr/local"));
        assertThat(arguments.valueOf("l"), is(true));
        assertThat(arguments.valueOf("p"), is(8080));
    }

    @Test (expected = UnspecifiedArgument.class)
    void should_raise_exception_with_unspecified_label() {
        String schemaAsText = "l:boolean p:integer";
        SchemaXiong schema = new SchemaXiong(schemaAsText);
        String[] argumentsAsStrings = {"-l", "true", "-p", "8080", "-d", "/usr/log"};
        Arguments arguments = new Arguments(schema, argumentsAsStrings);
//        try {
//            new Arguments(schema, argumentsAsStrings);
//            fail();
//        } catch(UnspecifiedArgument e) {
//
//        }

    }

    @Before
    void SetUp() {

    }

}
