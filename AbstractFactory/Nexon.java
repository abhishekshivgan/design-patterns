package AbstractFactory;

public class Nexon extends Car {
    
    public Nexon() {
        this.price = 1549000.00;
        this.seats = 5;
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
        System.out.println("Driving Nexon");
    }

    @Override
    public void transport() {
        System.out.println("Use Nexon as Private transport");
    }

    
}
