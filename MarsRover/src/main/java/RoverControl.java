import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RoverControl {
    public List<String> load() {
        List<String> content = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("testData.txt");
        try (Stream<String> stream = Files.lines(Paths.get(resource.getPath()), StandardCharsets.UTF_8)) {
            stream.forEach(s -> content.add(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
    //position:1,2,N;command:L,F,L,F,L,F,L,F,F,B,R,F
    public String getPostionString(String msg) {
        return msg.split(";")[0].split(":")[1];
    }

    public String getCommandString(String msg) {
        return msg.split(";")[1].split(":")[1];

    }
}
