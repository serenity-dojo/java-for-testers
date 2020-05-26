package com.serenitydojo;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithLists {

    @Test
    public void creatingASimpleList() {

        List simpleList = new ArrayList();

        simpleList.add("A string");
        simpleList.add(123);

        assertThat(simpleList).contains("A string",123);
    }

    /**
     * Notice how now we can't add variables of different types
     */
    @Test
    public void creatingATypedList() {
        List<String> names = Arrays.asList("joe", "sally","pete");
        List<Integer> ages = Arrays.asList(20,30,40);

        assertThat(names).containsExactly("joe", "sally","pete");
        assertThat(ages).containsExactly(20,30,40);
    }

    /**
     * We can also add and remove items from a list
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
    }

    /**
     * ...but not if we create the list with Arrays.asList
     */
    @Test
    public void immutableListsCannotBeModified() {
        List<String> names = Arrays.asList("joe", "sally","pete");

        // THIS WONT WORK: names.add("paul");
        // THIS WONT WORK: names.remove("sally");
    }

    @Test
    public void findingElementsInAList() {
        List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");

        assertThat(names.indexOf("sally")).isEqualTo(1);
        assertThat(names.lastIndexOf("sally")).isEqualTo(4);
    }

    @Test
    public void findingASubList() {
        List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");
        List<String> firstTwoName = names.subList(0,2);

        assertThat(firstTwoName).containsExactly("joe", "sally");
    }

    @Test
    public void clearingAList() {
        List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");

        names.clear();

        assertThat(names).hasSize(0);
    }

    @Test
    public void convertingAListToASet() {
        List<String> names = Arrays.asList("joe", "sally", "pete", "paul", "sally");

        Set<String> nameSet = new HashSet<>(names);
        assertThat(nameSet).containsExactlyInAnyOrder("joe", "sally", "pete", "paul");
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
    }

}
