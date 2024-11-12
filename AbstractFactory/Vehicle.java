package AbstractFactory;

public abstract class Vehicle {
    protected double price;
    
    public abstract double getPrice();
    public abstract void drive();
    public abstract void transport();
}
