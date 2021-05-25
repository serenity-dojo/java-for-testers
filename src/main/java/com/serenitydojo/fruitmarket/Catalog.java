package com.serenitydojo.fruitmarket;

import com.serenitydojo.exceptions.FruitUnavailableException;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;

import java.util.*;

public class Catalog {

    private Map<Fruit, Double> pricePerKilo = new HashMap<>();

    public PriceSetter setPriceOf(Fruit fruit) {
        return new PriceSetter(this, fruit);
    }

    public Double getPriceOf(Fruit fruit) {
        if(pricePerKilo.containsKey(fruit)){
            return pricePerKilo.get(fruit);
        }else{
            throw new FruitUnavailableException("The " + fruit + " are not yet available");
        }
    }

    public List<String> sortCatalog() {
        List<String> availableFruits = new ArrayList<>();
        for( Fruit fruit : this.pricePerKilo.keySet()){
            availableFruits.add(fruit.name());
        }
        Collections.sort(availableFruits);
        return availableFruits;
    }

    public void displayCatalog(){
        List<String> catalog = sortCatalog();
        for(String item : catalog){
            System.out.println(item);
        }
        System.out.println(sortCatalog());
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
