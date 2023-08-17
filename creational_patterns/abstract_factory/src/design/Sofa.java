package src.design;

// Concrete Products: Chair, Sofa, CoffeeTable
public class Sofa implements Furniture {
    private String style;

    public Sofa(String style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println("This is a " + style + " sofa.");
    }
}
