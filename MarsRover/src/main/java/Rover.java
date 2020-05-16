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
    public Direction direction;
    private String positionAsString;

    public Rover(String positionAsString) {
        this.positionAsString = positionAsString;
        this.coordinate = initialCoordinate();
        this.direction = initialDirection();
    }

    private Direction initialDirection() {
        String pos = positionAsString.split(",")[2];
        switch (pos) {
            case "E" :
                return Direction.EAST;
            case "S" :
                return Direction.SOUTH;
            case "W":
                return Direction.WEST;
            case "N":
            default:
                return Direction.NORTH;
        }
    }

    private Coordinate initialCoordinate() {
        String[] positionArray = positionAsString.split(",");
        int x = Integer.parseInt(positionArray[0]);
        int y = Integer.parseInt(positionArray[1]);
        return new Coordinate(x,y);
    }

    public void execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
        }
    }
}
