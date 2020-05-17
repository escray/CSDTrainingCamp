import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoverTest {

    private Rover rover;

    @Before
    public void setup() {
        rover = new Rover("1,2,N");
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
        assertThat(rover.coordinate, is(new Coordinate(1,3)));
    }

    @Test
    public void rover_should_forward_and_forward() {
        rover.execute("FF");
        assertThat(rover.coordinate, is(new Coordinate(1,4)));
    }

    @Test
    public void rover_should_backward() {
        rover.execute("B");
        assertThat(rover.direction.value(), is("N"));
        assertThat(rover.coordinate, is(new Coordinate(1,1)));
        rover.execute("BB");
        assertThat(rover.coordinate, is(new Coordinate(1,-1)));
    }

    @Test
    public void rover_should_backward_and_forward() {
        rover.execute("BF");
        assertThat(rover.coordinate, is(new Coordinate(1,2)));
    }

    @Test
    public void rover_should_move_free() {
        String commands = "L,F,L,F,L,F,L,F,F,B,R,F".replace(",", "");
        rover.execute(commands);
        assertThat(rover.direction.value(), is("E"));
        assertThat(rover.coordinate, is(new Coordinate(2,2)));
    }

    @Test
    public void for_test_coverage() {
        Rover southRover = new Rover("0,0,S");
        assertThat(southRover.direction.value(), is("S"));
        Rover westRover = new Rover("0,0,W");
        assertThat(westRover.direction.value(), is("W"));
        Direction direction = Direction.SOUTH;
        assertThat(direction.directionMatch("x"), is(Direction.NORTH));
    }
}
