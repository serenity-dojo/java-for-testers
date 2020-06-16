package com.serenitydojo;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class WhenFilteringLists {


    @Test
    public void whenSortingByID() {
        List<Order> orders = List.of(
                new Order("1","bread",1,0.75, 0.75, Collections.emptyList()),
                new Order("2","milk",2,1.75, 3.50, Collections.emptyList()),
                new Order("3","cheese",5,5.00, 25, Collections.emptyList())
        );

        System.out.println(orders);
    }
    // Filter by size
}
