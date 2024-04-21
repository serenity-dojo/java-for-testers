package com.serenitydojo.checks;
import static org.assertj.core.api.Assertions.assertThat;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.testng.annotations.Test;

public class EnumsTests {
	
    @Test
    public void theFoodTypeEnumShouldExist() throws ClassNotFoundException {
    assertThat(Class.forName("com.serenitydojo.model.FoodTypeEnum")).isNotNull();
    assertThat(Class.forName("com.serenitydojo.model.FoodTypeEnum").isEnum()).isNotNull();
    
    System.out.println("\nTC-01 - theFoodTypeEnumShouldExist() - Executed successfully.");
    }

    
    @Test
    public void theFoodTypeEnumShouldHaveSomeValues() throws ClassNotFoundException {
    assertThat(Class.forName("com.serenitydojo.model.FoodTypeEnum").getEnumConstants()).isNotEmpty();
    
    System.out.println("\nTC-02 - theFoodTypeEnumShouldHaveSomeValues() - Executed successfully.");
    }

    
    @Test
    public void theFeedsMethodShouldReturnTheEnum() throws Exception {
    Method[] methods = Class.forName("com.serenitydojo.model.FeederEntity").getMethods();
    Method feedMethod = Arrays.stream(methods)
    		                  .filter(method -> method.getName().equals("feeds")).findFirst()
                              .orElseThrow(() -> new IllegalArgumentException("No feeds() method found on the Feeder class"));
    
    assertThat(feedMethod.getReturnType().getName()).isEqualTo("com.serenitydojo.model.FoodTypeEnum");
    System.out.println("\nTC-03 - theFeedsMethodShouldReturnTheEnum() - Executed successfully.");
    }

}