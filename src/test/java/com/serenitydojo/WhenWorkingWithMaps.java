package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithMaps {

    @Test
    public void mapFromAnIndexTypeToAValueType() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        int sallysAge = ages.get("sally");

        assertThat(sallysAge).isEqualTo(20);
    }

    @Test
    public void keysMustBeUnique() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        ages.put("sally",25);

        int sallysAge = ages.get("sally");

        assertThat(sallysAge).isEqualTo(25);
    }

    @Test
    public void doesAMapContainAKey() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        assertThat(ages.containsKey("sally")).isTrue();
        assertThat(ages.containsKey("paul")).isFalse();
    }


    @Test
    public void doesAMapContainAValue() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        assertThat(ages.containsValue(20)).isTrue();
    }


    @Test
    public void listAllTheKeys() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        assertThat(ages.keySet()).containsOnly("sally","brian","geoff");
    }

    @Test
    public void iteratingOverTheKeys() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        for(String key : ages.keySet()) {
            System.out.println("Age of " + key + " = " + ages.get(key));
        }
    }

    @Test
    public void iteratingOverTheEntriesOfAMap() {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("sally",20);
        ages.put("brian",30);
        ages.put("geoff",40);

        for(Map.Entry<String, Integer> entry: ages.entrySet()) {
            System.out.println("Age of " + entry.getKey() + " = " + entry.getValue());
        }
    }

}
