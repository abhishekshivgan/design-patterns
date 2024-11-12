package AbstractFactory;

public class CarFactory {
    
    public static Vehicle createVehicle(String carType) {
        if (carType.equalsIgnoreCase("wagonr")) {
            return new WagonR();
        } else if (carType.equalsIgnoreCase("nexon")) {
            return new Nexon();
        } else if (carType.equalsIgnoreCase("fortuner")) {
            return new Fortuner();
        }
        throw new IllegalArgumentException("Unknown car type");
    }
}
