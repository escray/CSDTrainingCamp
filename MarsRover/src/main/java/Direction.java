public enum Direction {
    NORTH("N", "W", "E"),
    EAST("E", "N", "S"),
    SOUTH("S", "E", "W"),
    WEST("W", "S", "N");

    private final String value;
    private final String left;
    private final String right;

    Direction(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction directionMatch(String value) {
        for (Direction direction : values()) {
            if (direction.value == value) {
               return direction;
            }
        }
        return Direction.NORTH;
    }

    public String value() {
        return value;
    }

    public Direction left() {
        return directionMatch(this.left);
    }

    public Direction right() {
        return directionMatch(this.right);
    }
}
