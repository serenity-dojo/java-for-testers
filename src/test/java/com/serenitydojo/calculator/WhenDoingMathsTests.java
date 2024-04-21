package com.serenitydojo.calculator;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenDoingMathsTests {

	Calculator calculator = new Calculator();

	@Test
	public void shouldReturnZeroForAnEmptyString() {
	assertThat(calculator.evaluate("")).isEqualTo(0);
	System.out.println("\nTC-01 - shouldReturnZeroForAnEmptyString() - Executed successfully.");
	}

	
	@org.junit.Test(expected = IllegalMathsOperatorException.class)
	public void shouldReportNonSupportedOperations() {
	calculator.evaluate("1 ^ 2");
	System.out.println("\nTC-02 - shouldReportNonSupportedOperations() - Executed successfully.");
	}

	
	@Test
	public void shouldReturnTheValueOfASingleNumber() {
	assertThat(calculator.evaluate("1")).isEqualTo(1);
	System.out.println("\nTC-03 - shouldReturnTheValueOfASingleNumber() - Executed successfully.");
	}

	
	@Test
	public void shouldAddTwoNumbers() {
	assertThat(calculator.evaluate("1 + 1")).isEqualTo(2);
	System.out.println("\nTC-04 - shouldAddTwoNumbers() - Executed successfully.");
	}

	
	@Test
	public void shouldAddThreeNumbers() {
	assertThat(calculator.evaluate("1 + 2 + 3")).isEqualTo(6);
	System.out.println("\nTC-04 - shouldAddThreeNumbers() - Executed successfully.");
	}

	
	@Test
	public void shouldAlsoSubtract() {
	assertThat(calculator.evaluate("10 - 6")).isEqualTo(4);
	System.out.println("\nTC-05 - shouldAlsoSubtract() - Executed successfully.");
	}

	
	@Test
	public void shouldAddAndSubtract() {
	assertThat(calculator.evaluate("10 + 5 - 6")).isEqualTo(9);
	System.out.println("\nTC-06 - shouldAddAndSubtract() - Executed successfully.");
	}

	
	@Test
	public void shouldMultiplyNumbers() {
	assertThat(calculator.evaluate("10 * 5")).isEqualTo(50);
	System.out.println("\nTC-07 - shouldMultiplyNumbers() - Executed successfully.");
	}

}