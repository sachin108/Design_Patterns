package src.design;


//Factory class to create instances of transportation classes
public class TransportationFactory {
    public static Transportation createTransportation(String type) {
        if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("sea")) {
            return new Sea();
        } else {
            throw new IllegalArgumentException("Invalid transportation type.");
        }
    }
}