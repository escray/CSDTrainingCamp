@SuppressWarnings("ALL")
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
            case "E" : return Direction.EAST;
            case "S" : return Direction.SOUTH;
            case "W": return Direction.WEST;
            case "N":
            default: return Direction.NORTH;
        }
    }

    private Coordinate initialCoordinate() {
        String[] positionArray = positionAsString.split(",");
        return new Coordinate(Integer.parseInt(positionArray[0]), Integer.parseInt(positionArray[1]));
    }

    public void execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') direction = direction.right();
            if (c == 'L') direction = direction.left();
            if (c == 'F') coordinate = forward(coordinate, direction);
            if (c == 'B') coordinate = backward(coordinate, direction);
        }
    }

    private Coordinate backward(Coordinate coordinate, Direction direction) {
        return move(coordinate, direction, false);
    }

    private Coordinate forward(Coordinate coordinate, Direction direction) {
        return move(coordinate, direction, true);
    }

    public Coordinate move(Coordinate coordinate, Direction direction, boolean isForward) {
        int x = coordinate.x();
        int y = coordinate.y();
        int step = isForward ? 1 : -1;
        if (direction == Direction.NORTH) y += step;
        if (direction == Direction.SOUTH) y -= step;
        if (direction == Direction.EAST) x += step;
        if (direction == Direction.WEST) x -= step;
        return new Coordinate(x, y);
    }
}
