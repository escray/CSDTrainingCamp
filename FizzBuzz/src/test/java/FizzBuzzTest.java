import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_say_1_when_raw_number_is_1() {
        checkFizzBuzz(1, "1");
        checkFizzBuzz(2, "2");
    }

    @Test
    public void should_say_fizz_when_raw_number_is_3() {
        checkFizzBuzz(3, "Fizz");
        checkFizzBuzz(6, "Fizz");
    }

    @Test
    public void should_say_buzz_when_raw_number_is_5() {
       checkFizzBuzz(5, "Buzz");
        checkFizzBuzz(10, "Buzz");
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() {
        checkFizzBuzz(15, "FizzBuzz");
    }

    @Test
    public void should_say_fizz_or_buzz_when_raw_number_contains_3_or_f() {
        checkFizzBuzz(13, "Fizz");
        checkFizzBuzz(51, "FizzBuzz");
        checkFizzBuzz(52, "Buzz");
    }

    private void checkFizzBuzz(int i, String fizz) {
        assertThat(new FizzBuzz(i).toString(), is(fizz));
    }
}
