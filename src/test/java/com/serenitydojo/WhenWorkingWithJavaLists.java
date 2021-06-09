package com.serenitydojo;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList(){
        List simpleList = new ArrayList();
        simpleList.add("this is a simple list");
        simpleList.add(123);
        assertThat(simpleList).contains("this is a simple list",123);


    }
    @Test
    public void creatATypedList(){
        List<String> names = Arrays.asList("joe","sally","pete");
        List<Integer> ages = Arrays.asList(10,20,20);
        assertThat(names).contains("joe","sally","pete");

        List<Number> favoriteNumbers = Arrays.asList(10,20,30,10000000l,4.4);
        assertThat(favoriteNumbers).contains(10,20,30,10000000l,4.4);
    }
    @Test
    public void removingStuff(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("mike");
        names.add("tim");

        names.remove("joe");
        assertThat(names).contains("mike","tim");
        names.clear();
        assertThat(names).isEmpty();
    }
    @Test
    public void combiningLists(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        List<String>moreNames = new ArrayList<>();
        names.add("paul");
        names.add("petra");

        names.addAll(moreNames);
        assertThat(names).contains("joe","sally","pete","paul","petra");

        names.removeAll(moreNames);




        names.remove("joe");
        assertThat(names).contains("mike","tim");
        names.clear();
        assertThat(names).isEmpty();
    }
    @Test
    public void immutableList(){
        List<String> names = Arrays.asList("joe","mike","tim");// these are fixed lists, can not add or remove
        names.remove("joe");
        names.add("paul");

    }
    @Test
    public void findElementInAList(){
        List<String> names = Arrays.asList("joe","Sally","Pete","Sally","Paul");
        int indexOfSally = names.indexOf("Sally");
        int lastIndexOfSally = names.lastIndexOf("Sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);
    }
    @Test
    public void findingASubList(){
        List<String> names = Arrays.asList("joe","sally","paul");
        List<String>middleNames = names.subList(1,2);
        assertThat(names).contains("joe","sally","paul");
    }
    @Test
    public void findingTheSize(){
        List<String> names = Arrays.asList("joe","sally","paul");
        assertThat(names.size()).isEqualTo(3);
    }
    @Test
    public void convertingAListToAset(){
        List<String>names = Arrays.asList("joe","sally","pete","sally","paul");
        Set<String> uniqueNames = new HashSet<>(names);
        assertThat(uniqueNames).containsExactlyInAnyOrder("joe,sally","pete","paul");
    }
    @Test
    public void sortingAList(){
        List<String>names = Arrays.asList("joe","sally","pete","sally","paul");
        Collections.sort(names);
        assertThat(names).containsExactly("joe","paul","pete","sally","sally");

    }
    @Test
    public void findingMaxAndMin(){
        List<Integer> ages = Arrays.asList(15,10,50,30,20);
        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);

    }


}
