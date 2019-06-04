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

    @Override // décollage
    public void takeOff() {
        if (!this.flying && this.altitude == 0) { // si false ET altitude = 0
            this.flying = true; // alors true
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override // augmentation altitude
    public int ascend(int meters) {
        if (this.flying) { // si true
            this.altitude = Math.min(this.altitude + meters, 10000); // prendre la valeur minimum entre altitude et 1000
            System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override // diminution altitude
    public int descend(int meters) {
        if (this.flying) { // si true
            this.altitude = Math.max(this.altitude - meters, 1); // prendre la valeur maximum entre altitude et 1
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override // atterrisage
    public void land() {
        if (this.flying && this.altitude == 1) { // si true && altitude = 1
            this.altitude = 0;
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't lands.");
        }
    }
}