public class Motor {
    private boolean on;
    private int speed;
    private int distance; // нийт явсан зай

    public Motor(int speed) {
        this.speed = speed;
        this.on = false;
        this.distance = 0;
    }

    public boolean isOn() {
        return on;
    }

    public int getDistance() {
        return distance;
    }

    public void start() {
        on = true;
    }

    public void stop() {
        on = false;
    }

    public void moveForward() {
        if (on) {
            distance += speed;
        }
    }
}
