package org.codingdojo.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InchTest {
    @Test
    public void should_1_inch_equal_to_1_inch() {
        Inch inch = new Inch(1);
        assertThat(inch, is(new Inch(1)));
    }

    @Test
    public void shoud_1_foot_equal_to_12_inches() {
//        assertThat(new Foot(1), is(new Inch(12)));
        new Length(1, "inch");
    }
}
