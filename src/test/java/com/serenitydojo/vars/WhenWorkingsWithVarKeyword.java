package com.serenitydojo.vars;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.Arrays;


public class WhenWorkingsWithVarKeyword {

    @Test
    public void itShouldWorkingWithStrings(){
        var name = "Shane";
        var firstName = name;

        var names = Arrays.asList("Paul","Betty");
        var streamOfNames = names.stream();

        for(var someNames : names) {
            System.out.println(someNames);
        }

        assertThat(firstName).isEqualTo(name);
    }

}
