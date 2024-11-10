package FactoryMethod;

public class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("runs on 4 wheels");
    } 

    @Override
    public void transport() {
        System.out.println("transport goods with car");
    }
}
