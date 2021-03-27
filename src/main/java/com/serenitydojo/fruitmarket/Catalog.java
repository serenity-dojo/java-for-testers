package com.serenitydojo.fruitmarket;

import java.util.*;

public class Catalog {

    private Map<Fruit, Double> pricePerKilo = new HashMap<>();

    public PriceSetter setPriceOf(Fruit fruit) {
        return new PriceSetter(this, fruit);
    }

    public Double getPriceOf(Fruit fruit) throws FruitUnavailableException {
        try
        {
            return pricePerKilo.get(fruit);
        }
        catch (NullPointerException fruitNotFound)
        {
            throw new FruitUnavailableException("Unable to find the fruit ",fruitNotFound);
        }
    }

    public static class PriceSetter {
        private final Catalog catalog;
        private final Fruit fruit;

        public PriceSetter(Catalog catalog, Fruit fruit) {
            this.catalog = catalog;
            this.fruit = fruit;
        }

        public Catalog to(Double price) {
            catalog.pricePerKilo.put(fruit, price);
            return catalog;
        }
    }
    public List<String> returnCurrentlyAvailableFruit()
    {
        List <String> availableFruits = new ArrayList<>();
        for (Map.Entry <Fruit, Double> entry:pricePerKilo.entrySet())
        {
            availableFruits.add(entry.getKey().toString());
        }
        Collections.sort(availableFruits);
        return availableFruits;
    }
}
