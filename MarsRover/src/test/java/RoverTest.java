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
        assertThat(rover.direction.value(), is("N"));
    }

    @Test
    public void rover_should_turn_right() {
        rover.execute("R");
        assertThat(rover.direction.value(), is("E"));
    }

    @Test
    public void rover_should_turn_right_and_right() {
        rover.execute("RR");
        assertThat(rover.direction.value(), is("S"));
    }

    @Test
    public void rover_should_turn_left() {
        rover.execute("L");
        assertThat(rover.direction.value(), is("W"));
    }

    @Test
    public void rover_should_turn_left_and_right() {
        rover.execute("LR");
        assertThat(rover.direction.value(), is("N"));
    }

    @Test
    public void rover_should_forward() {
        rover.execute("F");
        assertThat(rover.direction.value(), is("N"));
//        assertThat(rover.coordinate, is(new Coordinate(2,2)));
    }
}
