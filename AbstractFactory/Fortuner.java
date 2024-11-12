package AbstractFactory;

public class Fortuner extends Car {
    
    public Fortuner() {
        this.seats = 7;
        this.price = 5200000.00;
    }

    @Override
    public int getSeats() {
        return this.seats;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void drive() {
        System.out.println("Driving Fortuner");
    }

    @Override
    public void transport() {
        System.out.println("Use fortuner as transport");
    }

    
}
