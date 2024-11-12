package AbstractFactory;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType, String model) {
        if (vehicleType.equalsIgnoreCase("car")) {
            return CarFactory.createVehicle(model);
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return BikeFactory.createVehicle(model);
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
