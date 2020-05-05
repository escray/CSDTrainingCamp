import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, is(10));
        product = five.times(3);
        assertThat(product.amount, is(15));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue((new Dollar(5)).equals(new Dollar(5)));
        assertThat((new Dollar(5)).equals(new Dollar(5)), is(true));
        assertThat((new Dollar(5)).equals(new Dollar(6)), is(false));
        Assert.assertEquals();
    }
}
