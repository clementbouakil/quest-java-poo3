public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.name + " takes off " + " the sky")
    }

    @Override
    public void ascend(int meters) {
        System.out.println(this.name + " flies upward, altitude : " + this.altitude);
    }

    @Override
    public void descend(int meters) {
        System.out.println(this.name + " flies downward, altitude : " + this.altitude);
    }

    @Override
    public void land() {
        if this.altitude >= 10{
            System.out.println(this.name + " is too high, it can't lands.");
        } else {
            System.out.println(this.name + " lands on the ground.");
        }
    }
}
