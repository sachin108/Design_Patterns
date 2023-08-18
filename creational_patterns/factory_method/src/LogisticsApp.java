package src;
import src.design.*;

// Client code
public class LogisticsApp {
    public static void main(String[] args) {
        Transportation truck = TransportationFactory.createTransportation("truck");
        Transportation sea = TransportationFactory.createTransportation("sea");

        truck.deliver(); // Output: Delivering by truck.
        sea.deliver();   // Output: Delivering by sea.
    }
}
