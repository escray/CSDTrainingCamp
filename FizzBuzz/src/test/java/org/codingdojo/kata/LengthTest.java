package org.codingdojo.kata;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equal_to_1_inch() {
        Length inch = new Length(1, Unit.Inch);
        assertThat(inch, is(new Length(1, Unit.Inch)));
    }

    @Test
    public void should_1_foot_equal_to_12_inches() {
        assertThat(new Length(1, Unit.Foot), is(new Length(12, Unit.Inch)));
    }

    @Test
    public void should_1_yard_equals_to_3_feet() {
        assertThat(new Length(1, Unit.Yard), is(new Length(3, Unit.Foot)));
        assertThat(new Length(2, Unit.Yard), is(new Length(72, Unit.Inch)));
    }
}
