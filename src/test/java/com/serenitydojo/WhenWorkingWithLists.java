package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithLists {

    @Test
    public void creatingSimpleList(){
        List simpleList = new ArrayList();
        simpleList.add("String");
        simpleList.add(234);

        Assertions.assertThat(simpleList).contains("String",234);
    }

    @Test
    public void createTypedList(){

        //List<String> names = new ArrayList<>();
        List<String> names = Arrays.asList("Joe", "Peter", "Charles");
        List<Integer> ages = Arrays.asList(23, 34, 21);

        assertThat(names).contains("Joe", "Peter", "Charles");
        assertThat(ages).contains(23, 34, 21);
    }

    @Test
    public void combiningLists(){
        List<String> names = new ArrayList<>();

        names.add("joe");
        names.add("jairo");
        names.add("sally");

        List<String> new_names = new ArrayList<>();

        names.add("charles");
        names.add("rosco");
        names.add("molly");

        //names.addAll(new_names);
        //assertThat(names).contains("joe","jairo","sally","charles","rosco","molly");
        names.removeAll(new_names);
        assertThat(names).contains("joe","jairo","sally");

        /*names.remove("joe");

        //assertThat(names).contains("jairo", "sally");

        names.clear();

        assertThat(names).isEmpty();*/
    }

    @Test
    public void findElementInList(){
        List<String> names = Arrays.asList("Joe", "Peter", "Charles", "Peter");

        int indexOfPeter = names.indexOf("Peter");
        int lastIndexOfPeter = names.lastIndexOf("Peter");

        assertThat(indexOfPeter).isEqualTo(1);
        assertThat(lastIndexOfPeter).isEqualTo(3);
    }

    @Test
    public void findingASublist(){
        List<String> names = Arrays.asList("Joe", "Peter", "Charles", "Peter", "Sally");
        List<String> middleNames = names.subList(1, 4);

        assertThat(names).contains("Peter", "Charles", "Peter");
    }

    @Test
    public void findingSize(){
        List<String> names = Arrays.asList("Joe", "Peter", "Charles", "Peter", "Sally");

        assertThat(names.size()).isEqualTo(5);
    }

    @Test
    public void convertingListToSet(){
        List<String> names = Arrays.asList("Joe", "Peter", "Charles", "Peter", "Sally", "Ruby");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("Joe", "Charles", "Peter", "Sally", "Ruby");
    }

    @Test
    public void sortingList(){
        List<String> names = Arrays.asList("Joe", "Peter", "Charles", "Peter", "Sally", "Ruby");

        Collections.sort(names);

        System.out.println(names);
        assertThat(names).containsExactly("Charles","Joe" , "Peter", "Peter", "Ruby", "Sally");
    }

    @Test
    public void findMaxAndMin(){
        List<Integer> ages = Arrays.asList(23, 34, 21, 2, 13, 66);

        assertThat(Collections.max(ages)).isEqualTo(66);
        assertThat(Collections.min(ages)).isEqualTo(2);
    }
}
