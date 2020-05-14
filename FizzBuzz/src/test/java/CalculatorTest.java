import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void should_add_two_numbers() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(1, 2), is(3));
        assertThat(calculator.add(1, 1), is(2));
    }


}
