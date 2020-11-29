package com.serenitydojo.fruitmarket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.serenitydojo.fruitmarket.Fruit.*;

public class Catalog {

    private Map<Fruit, Double> pricePerKilo = new HashMap<>();

    public PriceSetter setPriceOf(Fruit fruit) {
        return new PriceSetter(this, fruit);
    }

    public List<String> getAvailableFruit() {
        return pricePerKilo.keySet()
                .stream()
                .map(Enum::name)
                .sorted()
                .collect(Collectors.toList());
    }

    public Double getPriceOf(Fruit fruit) {
        if (pricePerKilo.containsKey(fruit)) {
            return pricePerKilo.get(fruit);
        }
        throw new FruitUnavailableException(fruit.name() + " currently unavailable");
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
}
