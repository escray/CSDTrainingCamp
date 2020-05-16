import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Rover {
    public String load() {
        StringBuilder content = new StringBuilder();
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("testData.txt");
        try (Stream<String> stream = Files.lines(Paths.get(resource.getPath()), StandardCharsets.UTF_8)) {
            stream.forEach(s -> content.append(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
