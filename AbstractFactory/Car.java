package AbstractFactory;

public abstract class Car extends Vehicle {
    protected int seats;

    public abstract int getSeats();
    public abstract String fuelType();
}
