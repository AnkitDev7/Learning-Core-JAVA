package Opps.PolymorPhism;

public class Bike extends Vihicle{
    private boolean hasCarrier;

    public Bike(String brand , int speed , boolean hasCarrier){
        super(brand , speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void Start(){
        System.out.println("Starting Bike...");
    }

    public void Start(String greet){
        System.out.println("Starting Bike..." + greet);
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
