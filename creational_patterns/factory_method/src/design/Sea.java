package src.design;

public class Sea implements Transportation {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea.");
    }
}
