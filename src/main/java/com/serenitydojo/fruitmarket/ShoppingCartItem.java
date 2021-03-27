package com.serenitydojo.fruitmarket;

public class ShoppingCartItem {
    private Fruit fruit;
    private Double quantity;
    private Double totalCost;

    public ShoppingCartItem(Fruit fruit, Double quantity, Double totalCost) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }


    public Fruit getFruit() {
        return fruit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getTotalCost()
    {
        if(this.getQuantity() > 5.00 || this.getQuantity() == 5)
        {
            totalCost=this.totalCost - (this.totalCost*0.1);
        }
        return totalCost;
    }
}
