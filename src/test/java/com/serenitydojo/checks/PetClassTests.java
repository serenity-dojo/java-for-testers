package com.serenitydojo.checks;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class PetClassTests {

	@Test
	public void thePetClassShouldExist() throws ClassNotFoundException {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.AbstractPetEntity")).isNotNull();
		System.out.println("\nTC-01 - thePetClassShouldExist() - Executed successfully.");
	}

	
	@Test
	public void shouldHaveAName() throws Exception {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.AbstractPetEntity").getDeclaredField("name").getGenericType())
				.isEqualTo(String.class);
		System.out.println("\nTC-02 - shouldHaveAName() - Executed successfully.");
	}

	
	@Test
	public void shouldHaveAnAge() throws Exception {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.AbstractPetEntity").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
	System.out.println("\nTC-03 - shouldHaveAnAge() - Executed successfully.");
	}

}