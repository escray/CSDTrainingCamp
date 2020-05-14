public class Rover {

    String direction;

    public Rover() {
        this.direction = "N";
    }

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = rotateRight();
            }
            if (c == 'L') {
                direction = rotateLeft();
            }
        }
        return "0:0:" + this.direction;
    }

    private String rotateRight() {
        if (direction == "E") {
            return "S";
        }
        else if (direction == "N") {
            return "E";
        }
        else if (direction == "S") {
            return  "W";
        }
        else if (direction == "W") {
            return "N";
        }
        return direction;
    }

    private String rotateLeft() {
        if (direction == "E") {
            return "N";
        }
        else if (direction == "N") {
            return "W";
        }
        else if (direction == "S") {
            return  "E";
        }
        else if (direction == "W") {
            return "S";
        }
        return direction;
    }
}
