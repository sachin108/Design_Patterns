import creational_patterns.abstract_factory.design.*;
import creational_patterns.abstract_factory.factory.*;

public class FurnitureShopSimulator {
    public static void main(String[] args) {
        // Create a Modern Furniture Factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.display();
        modernSofa.display();
        modernCoffeeTable.display();

        // Create a Victorian Furniture Factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        victorianChair.display();
        victorianSofa.display();
        victorianCoffeeTable.display();
    }
}
