import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemaTest {
    @Test
    public void should_convert_bool_value_by_flag_type() {
        Schema schema = new Schema("l:bool");
        assertThat(schema.convert("true", "l"), is(true));
        assertThat(schema.convert("false", "l"), is(false));
    }

    @Test
    public void should_convert_int_value_by_flag_type() {
        Schema schema = new Schema("p:int");
        assertThat(schema.convert("8080", "p"), is(8080));
        assertThat(schema.convert("010", "p"), is(10));
    }

    @Test
    public void should_convert_string_value_by_flag_type() {
        Schema schema = new Schema("d:string");
        assertThat(schema.convert("/usr/logs", "d"), is("/usr/logs"));
    }

    @Test(expected = UnSupportTypeException.class)
    public void should_throw_exception_when_type_not_support() {
        Schema schema = new Schema("q:array");
    }

    @Test(expected = NoSuchDefinitionException.class)
    public void should_throw_exception_when_flag_not_exist() {
        Schema schema = new Schema("l:bool");
        schema.getFlag("m");
    }
}
