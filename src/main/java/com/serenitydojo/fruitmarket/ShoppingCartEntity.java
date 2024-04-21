package com.serenitydojo.fruitmarket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingCartEntity {

	private final CatalogEntity catalog;
	private final List<ShoppingCartItemEntity> items;
	private final List<CatalogItem> catItems = new ArrayList<>();
	
	public ShoppingCartEntity(CatalogEntity catalog) {
		this.catalog = catalog;
		this.items = new ArrayList<>();
	}

	public ShoppingCartAdder add(Double amount) {
		return new ShoppingCartAdder(this, amount);
	}

	public List<ShoppingCartItemEntity> getItems() {
		return items;
	}

	public Double getTotalPrice() {
		return items.stream().mapToDouble(ShoppingCartItemEntity::getTotalCost).sum();
	}

	/**
	 * @return the catalog
	 */
	public CatalogEntity getCatalog() {
		return catalog;
	}

	
	public double getTotal() {
    double sum = catItems.stream().mapToDouble(it -> catalog.getPriceOf(it.getFruit()) * it.getAmountInKg()).sum();
    Map<FruitEnum, List<CatalogItem>> fruitToItems = catItems.stream()
				                                          .collect(Collectors.groupingBy(CatalogItem::getFruit));
    boolean anyFruitAbove5kg = fruitToItems.values().stream()
				                                    .anyMatch(items -> items.stream().mapToInt(CatalogItem::getAmountInKg).sum() > 5);
    if (anyFruitAbove5kg) {
    	int discountInPercent = 10;
    	return sum * (1 - (discountInPercent / 100.));
    }
	return sum;
	}

	
	public void addItem(FruitEnum fruit, int amountInKg) {
		catItems.add(catalog.getFruit(fruit, amountInKg));
	}

}