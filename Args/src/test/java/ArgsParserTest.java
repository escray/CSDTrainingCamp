import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgsParserTest {
    @Test
    public void should_parse_args() {
        ArgsParser argsParser = new ArgsParser("l:bool p:int d:string");
        String[] args = new String[]{"-l", "true", "-p", "8080", "-d", "/usr/logs"};
        argsParser.parse(args);
        assertThat(argsParser.getValue("l"), is(true));
    }
}
