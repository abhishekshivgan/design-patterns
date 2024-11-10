package FactoryMethod;

public class Truck extends Vehicle {
    
    @Override
    public void drive() {
        System.out.println("Runs on 8 wheels");
    }

    @Override
    public void transport() {
        System.out.println("transport heavy goods with truck");
    }
}
