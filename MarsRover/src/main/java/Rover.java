import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Rover {


    public Coordinate coordinate;
    public String direction;
    private String positionAsString;

    public Rover(String positionAsString) {
        this.positionAsString = positionAsString;
        this.coordinate = initialCoordinate();
        this.direction = initialDirection();
    }

    private String initialDirection() {
        return positionAsString.split(",")[2];
    }

    private Coordinate initialCoordinate() {
        String[] positionArray = positionAsString.split(",");
        int x = Integer.parseInt(positionArray[0]);
        int y = Integer.parseInt(positionArray[1]);
        return new Coordinate(x,y);
    }
}
