package com.serenitydojo.maps;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class WhenManipulatingWithJavaMapsTests {

	@Test
	public void mapFromAnIndexTypeToAValueType() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);
	int sallysAge = ages.get("sally");
	
	assertThat(sallysAge).isEqualTo(20);
    System.out.println("\nTC-01 - mapFromAnIndexTypeToAValueType() - Executed successfully.");
	}

	
	@Test
	public void keysMustBeUnique() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);
	ages.put("sally", 25);
	int sallysAge = ages.get("sally");
	
	assertThat(sallysAge).isEqualTo(25);
    System.out.println("\nTC-02 - keysMustBeUnique() - Executed successfully.");
	}

	
	@Test
	public void doesAMapContainAKey() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);
	
	assertThat(ages.containsKey("sally")).isTrue();
	assertThat(ages.containsKey("paul")).isFalse();
	System.out.println("\nTC-03 - doesAMapContainAKey() - Executed successfully.");
	}

	
	@Test
	public void doesAMapContainAValue() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);

	assertThat(ages.containsValue(20)).isTrue();
	System.out.println("\nTC-04 - doesAMapContainAValue() - Executed successfully.");
	}

	
	@Test
	public void listAllTheKeys() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);

	assertThat(ages.keySet()).containsOnly("sally", "brian", "geoff");
	System.out.println("\nTC-05 - listAllTheKeys() - Executed successfully.");
	}

	
	@Test
	public void iteratingOverTheKeys() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);

		for (String key : ages.keySet()) {
			System.out.println("Age of " + key + " = " + ages.get(key));
		}
	System.out.println("\nTC-06 - iteratingOverTheKeys() - Executed successfully.");
	}

	
	@Test
	public void iteratingOverTheEntriesOfAMap() {
	Map<String, Integer> ages = new HashMap<>();
	ages.put("sally", 20);
	ages.put("brian", 30);
	ages.put("geoff", 40);

		for (Map.Entry<String, Integer> entry : ages.entrySet()) {
			System.out.println("Age of " + entry.getKey() + " = " + entry.getValue());
		}
	System.out.println("\nTC-07 - iteratingOverTheEntriesOfAMap() - Executed successfully.");
	}

}