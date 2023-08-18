package src.factory;

import src.design.*;

// Concrete Factories: ModernFurnitureFactory, VictorianFurnitureFactory, ArtDecoFurnitureFactory
public class ModernFurnitureFactory implements FurnitureFactory {
    String style = "Modern";
    @Override
    public Chair createChair() {
        return new Chair(style);
    }

    @Override
    public Sofa createSofa() {
        return new Sofa(style);
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable(style);
    }
}

