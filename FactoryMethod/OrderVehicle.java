package FactoryMethod;

import java.util.Scanner;

public class OrderVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        Vehicle v = VehicleFactory.createVehicle(type);
        v.drive();
        v.transport();
        sc.close();
    }
}
