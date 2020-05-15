import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgsTest {
    @Test
    public void should_parse_bool_flag_withou_value() {
        Schema schema = new Schema("l:bool");
        String[] argsArray = new String[]{"-l"};
        Args args = new Args(schema, argsArray);
        assertThat(args.valueStringOf(Flag.of("l", "bool")), is("true"));
    }

    @Test
    public void should_parse_flag_with_value() {
        Schema schema = new Schema("p:int");
        String[] argsArray = new String[]{"-p", "8080"};
        Args args = new Args(schema, argsArray);
        assertThat(args.valueStringOf(Flag.of("p", "int")), is("8080"));
    }

    @Test
    public void should_parse_multi_flag_with_value() {
        Schema schema = new Schema("p:int l:bool");
        String[] argsArray = new String[]{"-p", "8080"};
        Args args = new Args(schema, argsArray);
        assertThat(args.valueStringOf(Flag.of("p", "int")), is("8080"));
        assertThat(args.valueStringOf(Flag.of("l", "bool")), is("true"));


    }
}
