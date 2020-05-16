import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTest {
    String msg = "position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F";
    @Test
    public void should_load_message() {
        Rover rover = new Rover();
        assertThat(rover.load(), is(msg));
    }
    @Test
    @Ignore
    public void should_Read_Position_and_Command() {
        Rover rover = new Rover();
        String message = "position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F";
        String positionAsString = rover.load();
        assertThat(positionAsString, is("1,2,N"));


    }
}
