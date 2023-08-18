package src.factory;

import src.design.*;

// Abstract Factory
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}

