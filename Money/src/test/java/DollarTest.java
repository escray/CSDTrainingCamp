import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = Money.dollar(5);
        assertThat(five.times(2), is(Money.dollar(10)));
        assertThat(five.times(3), is(Money.dollar(15)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        assertThat(Money.franc(10), is(five.times(2)));
        assertThat(Money.franc(15), is(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertEquals((Money.dollar(5)), Money.dollar(5));
        assertNotEquals((Money.dollar(5)), Money.dollar(6));
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    public void testDifferentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
