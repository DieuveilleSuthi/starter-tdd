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
        switch (direction){
            case"N":
            y +=1;
            break;
            case"S":
            y -=1;
            break;
            case"E":
            x +=1;
            break;
            case"W":
            x -=1;
            break;
        }
    }

    public void moveBack() {
        switch (direction){
            case"S":
            y +=1;
            break;
            case"N":
            y -=1;
            break;
            case"W":
            x +=1;
            break;
            case"E":
            x -=1;
            break;
        }
    }
}

