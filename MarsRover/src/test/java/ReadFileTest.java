import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReadFileTest {
    @Test
    public void should_read_file() {
        ReadFile readFile = new ReadFile("testData.txt");
        assertThat(readFile.getContent().size(), is(2));
    }


}
