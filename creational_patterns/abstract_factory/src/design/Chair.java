package src.design;

// Concrete Products: Chair, Sofa, CoffeeTable
public class Chair implements Furniture {
    private String style;

    public Chair(String style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println("This is a " + style + " chair.");
    }
}

