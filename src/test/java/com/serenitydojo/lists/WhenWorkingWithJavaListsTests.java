package com.serenitydojo.lists;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

public class WhenWorkingWithJavaListsTests {

	@Test
	public void creatingASimpleList() {
	var simpleList = new ArrayList<>();
	simpleList.add("a string value");
	simpleList.add(123);
	
	assertThat(simpleList).contains("a string value", 123);
	System.out.println("\nTC-01 - creatingASimpleList() - Executed successfully.");
	}

	
	@Test
	public void createATypedList() {
	List<String> names = Arrays.asList("joe", "sally", "pete");
	List<Integer> ages = Arrays.asList(10, 30, 50);
	List<Number> favoriteNumbers = Arrays.asList(10, 30, 50, 1000000000L, 3.14159);

	assertThat(names).contains("joe", "sally", "pete");
	assertThat(ages).contains(10, 30, 50);
	assertThat(favoriteNumbers).contains(10, 30, 50, 1000000000L, 3.14159);
	System.out.println("\nTC-02 - createATypedList() - Executed successfully.");
	}

	
	@Test
	public void removingStuff() {
	List<String> pets = new LinkedList<>();
	pets.add("joe");
	pets.add("sally");
	pets.add("pete");
	pets.remove("sally");
	
	assertThat(pets).contains("joe", "pete");
	pets.clear();
	assertThat(pets).isEmpty();
	System.out.println("\nTC-03 - removingStuff() - Executed successfully.");
	}

	
	@Test
	public void combiningLists() {
	List<String> names = new ArrayList<>();
	names.add("joe");
	names.add("sally");
	names.add("pete");
	
	List<String> moreNames = new ArrayList<>();
	names.add("paul");
	names.add("Petra");
	
	names.addAll(moreNames);
	assertThat(names).contains("joe", "sally", "pete", "paul", "Petra");
	names.removeAll(moreNames);
	System.out.println("\nTC-04 - combiningLists() - Executed successfully.");
	}

	
	@Test
	public void findElementInAList() {
	List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");
	int indexOfSally = names.indexOf("sally");
	int lastIndexOfSally = names.lastIndexOf("sally");
	
	assertThat(indexOfSally).isEqualTo(1);
	assertThat(lastIndexOfSally).isEqualTo(3);
	System.out.println("\nTC-05 - findElementInAList() - Executed successfully.");
	}

	
	@Test
	public void findingASublist() {
	List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");
	
	assertThat(names).contains("sally", "pete", "sally", "paul");
	System.out.println("\nTC-06 - findingASublist() - Executed successfully.");
	}

	
	@Test
	public void findingTheSize() {
	List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");
	
	assertThat(names.size()).isEqualTo(5);
	System.out.println("\nTC-07 - findingTheSize() - Executed successfully.");
	}

	
	@Test
	public void convertingAListToASet() {
	List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");
	Set<String> uniqueNames = new HashSet<>(names);
	
	assertThat(uniqueNames).containsExactlyInAnyOrder("joe", "sally", "pete", "paul");
	System.out.println("\nTC-08 - convertingAListToASet() - Executed successfully.");
	}

	
	@Test
	public void sortingAList() {
	List<String> names = Arrays.asList("joe", "sally", "pete", "sally", "paul");
	Collections.sort(names);
		
	assertThat(names).containsExactly("joe", "paul", "pete", "sally", "sally");
	System.out.println("\nTC-09 - sortingAList() - Executed successfully.");
	}

	
	@Test
	public void findingMaxAndMin() {
	List<Integer> ages = Arrays.asList(10, 30, 50, 20, 15);
	
	assertThat(Collections.max(ages)).isEqualTo(50);
	assertThat(Collections.min(ages)).isEqualTo(10);
	System.out.println("\nTC-10 - findingMaxAndMin() - Executed successfully.");
	}

}