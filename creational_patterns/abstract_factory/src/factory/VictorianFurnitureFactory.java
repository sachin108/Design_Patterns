package src.factory;

import src.design.*;

public class VictorianFurnitureFactory implements FurnitureFactory {
    String style = "Victorian";
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
