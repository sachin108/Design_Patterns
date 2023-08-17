package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.design.*;

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}

