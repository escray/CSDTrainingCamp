package org.codingdojo.kata;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertTest {
    @Test
    public void should_return_12_inch_if_input_is_1_foot() {
        assertThat(new Foot(1).inchCount, is(12));
        assertThat(new Foot(2).inchCount, is(24));
    }

    @Test
    public void should_return_1_foot_if_input_is_12_inch() {
        assertThat(new Inch(12).inchCount, is(new Foot(1).inchCount));
    }

    @Test
    public void should_return_3_foot_if_input_is_1_yard() {
        assertThat(new Yard(1).inchCount, is(new Foot(3).inchCount));
    }

    @Test
    public void should_equal_when_two_inch_has_same_num() {
        assertThat(new Inch(1).inchCount, is(new Inch(1).inchCount));
    }
}
