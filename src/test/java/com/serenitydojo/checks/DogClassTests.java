package com.serenitydojo.checks;
import static org.assertj.core.api.Assertions.assertThat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.testng.annotations.Test;

public class DogClassTests {

	@Test
	public void theDogClassShouldExist() throws ClassNotFoundException {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity")).isNotNull();
		System.out.println("\nTC-01 - theDogClassShouldExist() - Executed successfully.");
	}

	@Test
	public void theDogClassShouldHaveAName() throws Exception {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity").getDeclaredField("name").getGenericType())
				.isEqualTo(String.class);
		System.out.println("\nTC-02 - theDogClassShouldHaveAName() - Executed successfully.");
	}

	@Test
	public void theDogClassShouldHaveAFavoriteToy() throws Exception {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity").getDeclaredField("favoriteToy")
				.getGenericType()).isEqualTo(String.class);
		System.out.println("\nTC-03 - theDogClassShouldHaveAFavoriteToy() - Executed successfully.");
	}

	@Test
	public void theDogClassShouldHaveAnAge() throws Exception {
		assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity").getDeclaredField("age").getGenericType())
				.isEqualTo(int.class);
		System.out.println("\nTC-04 - theDogClassShouldHaveAnAge() - Executed successfully.");
	}

	
	@Test
	public void theDogClassShouldHaveAConstantField_MAKE_NOISE() throws Exception {
		Field makeNoise = Class.forName("com.serenitydojo.classAndObjects.DogEntity").getDeclaredField("DOG_NOISE");
		assertThat(makeNoise.getType()).isEqualTo(String.class);
		assertThat(Modifier.isFinal(makeNoise.getModifiers())).isTrue();
		assertThat(Modifier.isStatic(makeNoise.getModifiers())).isTrue();
		System.out.println("\nTC-05 - theDogClassShouldHaveAConstantField_MAKE_NOISE() - Executed successfully.");
	}
	
}