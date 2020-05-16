import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverAcceptanceTest {
    RoverControl roverControl;
    String messageVerify;
    @Before
    public void set_up() {
        roverControl = new RoverControl();
        messageVerify = "position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F";

    }
    // 1. RoverControl load the file and parse position and command
    @Test
    public void should_load_message() {
        List<String> msg = roverControl.load();
        // TODO: where is the number 2 come from ?
        assertThat(msg.size(), is(2));
        assertThat(msg.get(0), is(messageVerify));
    }

    @Test
    public void should_Read_Position_and_Command() {
        assertThat(roverControl.getPostionString(roverControl.load().get(0)), is("1,2,N"));
        assertThat(roverControl.getCommandString(roverControl.load().get(0)), is("L,F,L,F,L,F,L,F,F,B,R,F"));
        assertThat(roverControl.getPostionString(roverControl.load().get(1)), is("3,3,E"));
        assertThat(roverControl.getCommandString(roverControl.load().get(1)), is("F,F,R,F,F,R,F,R,R,F,L,F"));
    }


}
