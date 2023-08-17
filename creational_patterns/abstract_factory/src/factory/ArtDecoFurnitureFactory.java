package src.factory;

import src.design.*;

class ArtDecoFurnitureFactory implements FurnitureFactory {
    String style="Art Deco";
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