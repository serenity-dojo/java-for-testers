package com.serenitydojo.lists;
import static  org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.testng.annotations.Test;
import com.serenitydojo.model.OrderRecordEntity;

/**
 * This test class covers - Bonus Live Videos : Advanced Java - 'Record Classes'
 * implementation with Lists from 'java-for-testers-and-test-automation' course
 * of 'Serenity Dojo training and mentoring programme'
 * 
 */

public class WhenFilteringWithListsTests {

	@Test
	public void whenSortingByID() {
	List<OrderRecordEntity> orders = List.of(
				new OrderRecordEntity("1", "bread", 1, 0.75, 0.75, Collections.emptyList()),
				new OrderRecordEntity("2", "milk", 2, 1.75, 3.50, Collections.emptyList()),
				new OrderRecordEntity("3", "cheese", 5, 5.00, 25, Collections.emptyList())
				);

	System.out.println(orders);
	System.out.println("**************************************************");
	List<OrderRecordEntity> filterLst=orders.stream()
			             .filter(item -> item.quanity()>1)
			             .collect(Collectors.toList());
	System.out.println("********************FILTERED LIST BY QUANTITY******************************");
	filterLst.forEach(filterData -> System.out.println(filterData));
	System.out.println("\nTC-01 - whenSortingByID() - Executed successfully.");
	}
	

	/**
	 * Notice how now we can't add variables of different types
	 * 
	 */
	@Test
    public void creatingATypedList() {
    List<String> names = Arrays.asList("joe", "sally","pete");
    List<Integer> ages = Arrays.asList(20,30,40);
    
    assertThat(names).containsExactly("joe", "sally","pete");
    assertThat(ages).containsExactly(20,30,40);
    System.out.println("\nTC-02 - creatingATypedList() - Executed successfully.");
    }

	
    /**
     * We can also add and remove items from a list
     * 
     */
    @Test
    public void addingAndRemovingElements() {
    List<String> names = new ArrayList<>();
    names.add("joe");
    names.add("sally");
    names.add("pete");
    names.add("paul");
    names.remove("pete");

    assertThat(names).containsExactly("joe", "sally","paul");
    System.out.println("\nTC-03 - addingAndRemovingElements() - Executed successfully.");
    }

    
    /**
     * If we create the list with Arrays.asList
     * 
     */
    @Test
    public void immutableListsCannotBeModified() {
    List<String> names = Arrays.asList("joe", "sally","pete");
    //names.add("paul");
    //names.remove("sally");
    
    assertThat(names.size()).isEqualTo(3);
    System.out.println("\nTC-04 - immutableListsCannotBeModified() - Executed successfully.");
    }

    
    @Test
    public void findingElementsInAList() {
    List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");

    assertThat(names.indexOf("sally")).isEqualTo(1);
    assertThat(names.lastIndexOf("sally")).isEqualTo(4);
    System.out.println("\nTC-05 - findingElementsInAList() - Executed successfully.");
    }

    
    @Test
    public void findingASubList() {
    List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");
    List<String> firstTwoName = names.subList(0,2);

    assertThat(firstTwoName).containsExactly("joe", "sally");
    System.out.println("\nTC-06 - findingASubList() - Executed successfully.");
    }

  
    @Test
    public void clearingAList() {
    List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");
    //names.clear();

    assertThat(names).hasSize(5);
    System.out.println("\nTC-07 - clearingAList() - Executed successfully.");
    }

    
    @Test
    public void convertingAListToASet() {
    List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");
    Set<String> nameSet = new HashSet<>(names);
    
    assertThat(nameSet).containsExactlyInAnyOrder("joe", "sally", "pete", "paul");
    System.out.println("\nTC-08 - convertingAListToASet() - Executed successfully.");
    }

  
    @Test
    public void iteratingOverAListUsingAForLoop() {
    List<String> names = Arrays.asList("joe", "sally", "pete", "paul");
    StringBuilder listOfNames = new StringBuilder();  
    for(String name : names) {
    	listOfNames.append(name).append(" ");
    }
    String concatenatedNames = listOfNames.toString().trim();

    assertThat(concatenatedNames).isEqualTo("joe sally pete paul");
    System.out.println("\nTC-09 - iteratingOverAListUsingAForLoop() - Executed successfully.");
    }
    
    
}