package FactoryMethod;

public class Bike extends Vehicle {
    
    @Override
    public void drive() {
        System.out.println("runs on 2 wheels");
    }

    @Override
    public void transport() {
        System.out.println("transport goods with bike");
    }
}
