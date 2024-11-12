package AbstractFactory;

public class WagonR extends Car {
    
    public WagonR() {
        this.price = 699999.00;
        this.seats = 5;
    }

    @Override
    public int getSeats() {
        return this.seats;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void drive() {
        System.out.println("Driving WagonR");
    }

    @Override
    public void transport() {
        System.out.println("Use WagonR to transfer goods");
    }
}
