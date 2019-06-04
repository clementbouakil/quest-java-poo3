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
    public void takeOff() { // Si mon altitude est supérieur à 0 je décolle
        if (this.flying && this.altitude > 0)
        System.out.println(this.getName() + " takes off in the sky");
    }

    @Override
    public void ascend() { // Fonction permettant d'augmenter son altitude
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0)
            System.out.println(this.getName() + "flies upward, altitude : " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void descend() { // Fonction permettant de diminuer son altitude
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0)
            System.out.println(this.getName() + "flies downward, altitude : " + this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void land() { // Si mon altitude est égale 0 je dis que j'atterris
        if (!this.flying && this.altitude == 0) {
            System.out.println(this.getName() + " Eye Cherry lands on the ground.");
        }
    }
}
