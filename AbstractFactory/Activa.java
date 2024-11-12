package AbstractFactory;

public class Activa extends Bike {
    
    public Activa() {
        this.price = 109000.00;
    }

    @Override
    public boolean hasGear() {
        return false;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void drive() {
        System.out.println("Driving Activa");
    }

    @Override
    public void transport() {
        System.out.println("Use Activa for transport use");
    }

    
}
