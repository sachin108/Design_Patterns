package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.design.*;

class VictorianFurnitureFactory implements FurnitureFactory {
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
