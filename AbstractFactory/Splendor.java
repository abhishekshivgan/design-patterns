package AbstractFactory;

public class Splendor extends Bike {

    public Splendor() {
        this.price = 95000.00;
    }

    @Override
    public boolean hasGear() {
        return true;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void drive() {
        System.out.println("Driving Splendor");
    }

    @Override
    public void transport() {
        System.out.println("Use Splendor for personal tranport use");
    }
    
}
