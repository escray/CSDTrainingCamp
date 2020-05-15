import java.util.Optional;

public class Rover {

    Direction direction;
    Coordinate coordinate = new Coordinate(0, 0);

    private Grid grid;

    public Rover(Grid grid) {
        this.grid = grid;
        direction = Direction.NORTH;
    }

    public String execute(String commands) {
        String obstacleString = "";
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                obstacleString = move();
            }
        }
        return obstacleString + coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
    }

    private String move() {
        Optional<Coordinate> nextCoordinate = grid.nextCoordinateFor(this.coordinate, direction);
        nextCoordinate.ifPresent( nc -> this.coordinate = nc );
        return nextCoordinate.isPresent() ? "" : "O:";
    }
}
