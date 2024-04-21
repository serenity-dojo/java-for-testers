package com.serenitydojo.fruitmarket;

public class PriceSetter {
	
	private final CatalogEntity catalog;
    private final FruitEnum fruit;
    
	public PriceSetter(CatalogEntity catalog, FruitEnum fruit) {
		this.catalog = catalog;
		this.fruit = fruit;
	}
	
    public CatalogEntity to(Double price) {
        catalog.getPricePerKilo().put(fruit, price);
        return catalog;
    }

}