package com.serenitydojo.module16fruitshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The catalog keeps track of which fruit is available, and how much it costs per kilo.
 * <p>
 * Prices are set with a fluent API, for example:
 * <pre>
 *   catalog.setPriceOf(Apple).to(4.00).setPriceOf(Orange).to(5.50);
 * </pre>
 */
public class Catalog {

    private final Map<Fruit, Double> pricePerKilo = new HashMap<>();

//@@ solution
    public PriceSetter setPriceOf(Fruit fruit) {
        return new PriceSetter(this, fruit);
    }

    /**
     * The names of the fruit that are currently available, in alphabetical order.
     */
    public List<String> getAvailableFruit() {
        return pricePerKilo.keySet()
                .stream()
                .map(Enum::name)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * The current price per kilo of a fruit.
     *
     * @throws FruitUnavailableException if the fruit has no price in the catalog
     */
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
//@@ starter
    // TODO: return a PriceSetter for the fruit, so that the price can be set with .to(price)
    public PriceSetter setPriceOf(Fruit fruit) {
        throw new UnsupportedOperationException("TODO: setPriceOf");
    }

    /**
     * The names of the fruit that are currently available, in alphabetical order.
     */
    public List<String> getAvailableFruit() {
        // TODO: return the names of the fruit in the catalog, sorted alphabetically
        throw new UnsupportedOperationException("TODO: getAvailableFruit");
    }

    /**
     * The current price per kilo of a fruit.
     *
     * @throws FruitUnavailableException if the fruit has no price in the catalog
     */
    public Double getPriceOf(Fruit fruit) {
        // TODO: return the price, or throw a FruitUnavailableException with the message "<Fruit> currently unavailable"
        throw new UnsupportedOperationException("TODO: getPriceOf");
    }

    public static class PriceSetter {
        private final Catalog catalog;
        private final Fruit fruit;

        public PriceSetter(Catalog catalog, Fruit fruit) {
            this.catalog = catalog;
            this.fruit = fruit;
        }

        public Catalog to(Double price) {
            // TODO: record the price of the fruit in the catalog, and return the catalog
            throw new UnsupportedOperationException("TODO: to");
        }
    }
//@@ end
}
