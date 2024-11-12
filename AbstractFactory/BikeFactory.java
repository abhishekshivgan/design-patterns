package AbstractFactory;

public class BikeFactory {
    
    public static Vehicle createVehicle(String bikeType) {
        if (bikeType.equalsIgnoreCase("splendor")) {
            return new Splendor();
        } else if (bikeType.equalsIgnoreCase("activa")) {
            return new Activa();
        }
        throw new IllegalArgumentException("Unknown bike type");
    }
}
