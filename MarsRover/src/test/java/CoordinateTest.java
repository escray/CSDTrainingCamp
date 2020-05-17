import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CoordinateTest {
    Coordinate coordinate;
    Coordinate other;
    @Before
    public void set_up() {
        coordinate = new Coordinate(1, 1);
    }

    @Test
    public void should_equal() {
        other = coordinate;
        assertThat(coordinate.equals(other), is(true));
    }

    @Test
    public void should_not_equal() {
        other = new Coordinate(2, 1);
        assertThat(coordinate.equals(""), is(false));
        assertThat(coordinate == null, is(false));
        assertThat(coordinate.equals(other), is(false));
    }

}
