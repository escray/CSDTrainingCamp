import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverAcceptanceTest {

    @Test
    public void rover_should_create_and_move() {
        RoverControl roverControl = new RoverControl("testData.txt");
        String msg = "position:3,3,E;command:F,F,R,F,F,R,F,R,R,F,L,F";
        Rover rover = new Rover(roverControl.getPostionString(msg));
        String command = roverControl.getCommandString(msg).replace(",", "");
        rover.execute(command);
        assertThat(rover.direction.value(), is("N"));
        assertThat(rover.coordinate, is(new Coordinate(5,2)));
    }
}
