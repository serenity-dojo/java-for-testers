package com.serenitydojo;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaList {
    @Test
    public void creatingASimpleList(){
        List simpleList = new ArrayList<>();
        simpleList.add("a string value");
        simpleList.add(123);

        assertThat(simpleList).contains("a string value",123);
        //Assert.assertTrue(simpleList.contains(123));
    }

    @Test
    public void creatingATypedList(){
        // When using Arrays.asList the variable will be static and cannot modified
        List<String> names = Arrays.asList("joe", "sally", "pete");
        List<Integer> ages = Arrays.asList(10,30,50);
        List<Number> favoriteNumbers = Arrays.asList(10,30,50,10000000000L,3.1419);

        assertThat(names).contains("joe","pete","sally");
        assertThat(ages).contains(10,30,50);
        assertThat(favoriteNumbers).contains(10,30,50,10000000000L,3.1419);

    }

    @Test
    public void removingStuff(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        names.remove("sally");
        assertThat(names).contains("joe","pete");

        names.clear();
        assertThat(names).isEmpty();

    }

    @Test
    public void findElementInAList(){
        List<String> names = Arrays.asList("joe", "sally", "pete","sally","alpher");

        int indexSally = names.indexOf("sally");
        int lastIndex = names.lastIndexOf("sally");

        assertThat(indexSally).isEqualTo(1);
        assertThat(lastIndex).isEqualTo(3);
    }

    @Test
    public void findingASublist(){
        List<String> names = Arrays.asList("joe", "sally", "pete","mark","alpher");

        List<String> middlename = names.subList(1,4);

        assertThat(middlename).contains("sally", "pete","mark");
    }

    @Test
    public void findingTheSize(){
        List<String> names = Arrays.asList("joe", "sally", "pete","mark","alpher");

        assertThat(names.size()).isEqualTo(5);
    }

    @Test
    public void convertAListToASet(){
        List<String> names = Arrays.asList("joe", "sally", "pete","sally","alpher");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).contains("sally", "pete","joe","alpher");
    }

    @Test
    public void sortingAList(){
        List<String> names = Arrays.asList("joe", "sally", "pete","sally","paul");

        Collections.sort(names);
        assertThat(names).containsExactly("joe", "paul","pete","sally","sally");
    }

    @Test
    public void findingMaxAndMin(){
        List<Integer> ages = Arrays.asList(10,3,30,50,1,20,15);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(1);
    }

    @Test
    public void combiningList(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        List<String> moreNames = new ArrayList<>();
        names.add("lisa");
        names.add("kerry");
        names.add("paul");

        names.addAll(moreNames);

        assertThat(names).contains("joe","pete","sally","lisa","kerry","paul");
        names.removeAll(moreNames);
        assertThat(names).contains("joe","pete","sally");
    }
}
