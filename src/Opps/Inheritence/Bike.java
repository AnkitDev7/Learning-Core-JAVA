package Opps.Inheritence;

import java.security.PublicKey;

public class Bike extends Vihicle{
    private boolean hasCarrier;

    public Bike(String brand , int speed , boolean hasCarrier){
        super(brand , speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
