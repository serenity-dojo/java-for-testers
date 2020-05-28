package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList() {

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        assertThat(simpleList).contains("a string value",123);

    }

    @Test
    public void createATypedList() {
        List<String> names = Arrays.asList("joe","sally","pete");
        List<Integer> ages = Arrays.asList(10,30,50);
        List<Number> favoriteNumbers = Arrays.asList(10,30,50, 1000000000L, 3.14159);

        assertThat(names).contains("joe","sally","pete");
        assertThat(ages).contains(10,30,50);
        assertThat(favoriteNumbers).contains(10,30,50, 1000000000L, 3.14159);
    }

    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<>();
        List<String> pets = new LinkedList<>();

        names.add("joe");
        names.add("sally");
        names.add("pete");

        names.remove("sally");

        assertThat(names).contains("joe","pete");

        names.clear();

        assertThat(names).isEmpty();

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

        assertThat(names).contains("joe","sally","pete","paul","Petra");

        names.removeAll(moreNames);
    }

    @Test
    public void findElementInAList() {    // 0    1       2      3       4
        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        int indexOfSally = names.indexOf("sally");
        int lastIndexOfSally = names.lastIndexOf("sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);
    }

    @Test
    public void findingASublist() {
        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        List<String> middleNames = names.subList(1,5);

        assertThat(names).contains("sally","pete","sally","paul");

    }

    @Test
    public void findingTheSize() {
        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        assertThat(names.size()).isEqualTo(5);
    }

    @Test
    public void convertingAListToASet() {
        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("joe","sally","pete","paul");
    }

    @Test
    public void sortingAList() {
        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        Collections.sort(names);
        assertThat(names).containsExactly("joe","paul","pete","sally","sally");
    }

    @Test
    public void findingMaxAndMin() {
        List<Integer> ages = Arrays.asList(10,30,50,20,15);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);
    }
}
