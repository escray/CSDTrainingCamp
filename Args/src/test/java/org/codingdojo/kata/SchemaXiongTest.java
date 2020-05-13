package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchemaXiongTest {
    @Test
    public void should_create_schema_out_of_text() {
        String schemaAsTest = "l:boolean p:integer d:string";
        SchemaXiong schema = new SchemaXiong(schemaAsTest);
        assertThat(schema.size(), is(3));
    }

    @Test
    void should_find_argument_spec_by_label() {
        String schemaAsText = "l:boolean p:integer d:string";
        SchemaXiong schema = new SchemaXiong(schemaAsText);
//        ArgumentSpec(spec.label, is("l"));

    }
}
