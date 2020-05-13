package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class ArgumentTest {
    @Test
    void should_create_argument_out_of_schema_and_label_and_raw_value() {
        SchemaXiong schema = new SchemaXiong("l:boolean");
        Argument argument = new Argument(schema, "-l", "true");
        assertThat(argument.label, is("l"));
        assertThat(argument.rawValue, is("true"));
        assertThat(argument.type, is("boolean"));


    }

    @Test
    void should_determine_if_argument_is_of_given_label() {
        SchemaXiong schema = new SchemaXiong("l:boolean");

        Argument argument = new Argument(schema, "-l", "true");

    }

    @Test
    public void should_support_string_array_type() {
        SchemaXiong schema = new SchemaXiong("x:[string]");
        Argument argument = new Argument(schema, "-x", "123, 456");
        assertThat(argument.value(), is(new String[]{"123", "456"}));
    }

}
