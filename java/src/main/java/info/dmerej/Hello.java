package info.dmerej;

class Rover {
    private int x;
    private int y;
    private String direction;


    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public String getFacing(){
        return direction;
    }
    public void changeDirection(String newDirection) {
        this.direction = newDirection;
    }

    public void moveForward() {
        if (direction.equals("N")) {
            y += 1;
        }
         if (direction.equals("W")) {
            X += -1;
        }
         if (direction.equals("E")) {
            X += 1;
        }
         if (direction.equals("S")) {
            y += -1;
        }
    }
}

