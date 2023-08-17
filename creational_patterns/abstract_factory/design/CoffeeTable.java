package creational_patterns.abstract_factory.design;

// Concrete Products: Chair, Sofa, CoffeeTable
class CoffeeTable implements Furniture {
    private String style;

    public CoffeeTable(String style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println("This is a " + style + " coffee table.");
    }
}
