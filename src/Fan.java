public class Fan {

    private int speed;
    private boolean isReversed;

    public Fan() {
        this.speed = 0;
        this.isReversed = false;
    }

    public void pullSpeedCord() {
        if (speed < 3) {
            this.speed++;
        } else {
            this.speed = 0;
        }
    }

    public void pullReverseCord() {
        if (this.isReversed == false) {
            this.isReversed = true;
        } else {
            this.isReversed = false;
        }
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", isReversed=" + isReversed +
                '}';
    }
}