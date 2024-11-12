package AbstractFactory;

import java.util.Scanner;

public class OrderVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter vehicle type (car/bike): ");
        String vehicleType = sc.next().toLowerCase();

        System.out.print("Enter model: ");
        String model = sc.next().toLowerCase();

        try {
            Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, model);
            System.out.println("Vehicle Price: " + vehicle.getPrice());
            vehicle.drive();
            vehicle.transport();

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Seats: " + car.getSeats());
                System.out.println("Fuel Type: " + car.fuelType());
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("Has Gear: " + bike.hasGear());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
