package FactoryMethod;

public class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals(("bike"))) {
            return new Bike();
        } else if (type.equals("truck")) {
            return new Truck();
        }

        throw new IllegalArgumentException("Unknown vehicle type");
    }

}
