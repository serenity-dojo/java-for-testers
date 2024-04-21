package com.serenitydojo.fruitmarket;
import static com.serenitydojo.fruitmarket.FruitEnum.Apples;
import static com.serenitydojo.fruitmarket.FruitEnum.Bananas;
import static com.serenitydojo.fruitmarket.FruitEnum.Pears;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CatalogEntity {

	private Map<FruitEnum, Double> pricePerKilo = new HashMap<>();
	private final List<CatalogItem> availableFruits = new ArrayList<>();

	public PriceSetter setPriceOf(FruitEnum fruit) {
		return new PriceSetter(this, fruit);
	}

	public void setPriceOf(FruitEnum fruit, double pricePerKg) {
		pricePerKilo.put(fruit, pricePerKg);
	}

	public List<String> getAvailableFruit() {
		return pricePerKilo.keySet().stream().map(Enum::name).sorted().collect(Collectors.toList());
	}

	public Double getPriceOf(FruitEnum fruit) {
		if (pricePerKilo.containsKey(fruit)) {
			return pricePerKilo.get(fruit);
		}
		throw new FruitUnavailableException(fruit.name() + " currently unavailable");
	}

	/**
	 * @return the pricePerKilo
	 */
	public Map<FruitEnum, Double> getPricePerKilo() {
		return pricePerKilo;
	}

	/**
	 * @return the availableFruits
	 */
	public List<CatalogItem> getAvailableFruits() {
		return availableFruits;
	}

	public static CatalogEntity withItems(CatalogItem... catalogItems) {
		CatalogEntity catalog = new CatalogEntity();
		catalog.availableFruits.addAll(Arrays.asList(catalogItems));
		return catalog;
	}

	public CatalogItem getFruit(FruitEnum fruit, int amountInKg) {
		List<CatalogItem> itemsForFruit = getAvailableFruits().stream().filter(it -> it.getFruit().equals(fruit))
				.collect(Collectors.toList());
		if (itemsForFruit.isEmpty()) {
			throw new FruitUnavailableException("no such fruit");
		}
		Optional<CatalogItem> optionalCatalogItem = itemsForFruit.stream()
				.filter(it -> it.getAmountInKg() == amountInKg).findFirst();
		if (optionalCatalogItem.isPresent()) {
			return optionalCatalogItem.get();
		}
		throw new FruitUnavailableException("no such amount");
	}

	public String getAvailableFruitNames() {
		return getAvailableFruits().stream().map(it -> it.getFruit().name()).sorted().collect(Collectors.joining(", "));
	}

	public static CatalogEntity catalogWithSomeItemsAndPricesForEverything() {
		CatalogEntity entityObj = CatalogEntity.withItems(new CatalogItem(Pears, 1), new CatalogItem(Apples, 2),
				new CatalogItem(Bananas, 4));

		entityObj.setPriceOf(Pears, 1.0);
		entityObj.setPriceOf(Apples, 8.00);
		entityObj.setPriceOf(Bananas, 2.0);
		return entityObj;
	}
}