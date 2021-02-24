package StringCalculator;
import org.junit.*;
import static org.junit.Assert.*;

public class Calculator {
	@Test
	public void emptyString() {
		assertEquals(0,StringCalculator.add(""));
	}
	@Test
	public void singleValue() {
		assertEquals(1,StringCalculator.add("1"));
	}
	@Test
	public void twoCommaSeparatedValues() {
		assertEquals(12,StringCalculator.add("6,6"));
	}
	@Test
	public void threeCommaSeparatedValues() {
		assertEquals(34,StringCalculator.add("1,30,3"));
	}
}
