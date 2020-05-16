import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoverTest {

    private String positionAsString;
    private Rover rover;

    @Before
    public void setup() {
        positionAsString = "1,2,N";
        rover = new Rover(positionAsString);
    }

    @Test
    public void should_create_rover_from_position() {
        assertThat(rover.coordinate, is(new Coordinate(1, 2)));
        assertThat(rover.direction, is("N"));
    }

    @Test
    public void should_get_direction_from_position() {

    }
}
