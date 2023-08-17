package src.design;

//Concrete classes for Truck and Sea transportation
public class Truck implements Transportation {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck.");
    }
}


