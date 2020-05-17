import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverControlTest {
    private RoverControl roverControl;
    private String messageVerify;

    @Before
    public void set_up() {
        roverControl = new RoverControl("testData.txt");
        messageVerify = "position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F";
    }

    @Test
    public void should_load_message() {
        List<String> msg = roverControl.content;
        // TODO: where is the number 2 come from ?
        assertThat(msg.size(), is(2));
        assertThat(msg.get(0), is(messageVerify));
    }

    @Test
    public void should_Read_Position_and_Command() {
        assertThat(roverControl.getPostionString(roverControl.content.get(0)), is("1,2,N"));
        assertThat(roverControl.getCommandString(roverControl.content.get(0)), is("L,F,L,F,L,F,L,F,F,B,R,F"));
        assertThat(roverControl.getPostionString(roverControl.content.get(1)), is("3,3,E"));
        assertThat(roverControl.getCommandString(roverControl.content.get(1)), is("F,F,R,F,F,R,F,R,R,F,L,F"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_no_file() {
        new RoverControl("not_exist.txt");
    }

    @Test
    @Ignore
    public void should_read_a_file() {
        RoverControl rc = new RoverControl("non_exist.txt");
        assertThat(rc.content.size(), is(0));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test(expected = NonReadBufferException.class)
    @Ignore
    public void should_get_IOException() {
        roverControl.getBufferReader(new File("non_exist.txt"));
    }
}
