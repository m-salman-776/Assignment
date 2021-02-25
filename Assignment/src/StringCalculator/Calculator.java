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
	@Test
	public void unknownNumberOfCommaSeparatedArguments() {
		assertEquals(7,StringCalculator.add("1,2,1,3"));
	}
	@Test
	public void allowNewLine() {
		assertEquals(6,StringCalculator.add("1\n2\n3"));
	}
	@Test 
	public void delimeterChange() {
		assertEquals(3,StringCalculator.add("//,\n1,2"));
	}
	@Test
	public void letsHandleNegatives() {
		try {
//			StringCalculator.add("//:\n1:3:-1");
//			StringCalculator.add("1\n-1\n3");
			StringCalculator.add("-1,-2,-3");
		}
		catch(RuntimeException e) {
//			assertEquals("Negatives are not allowed -1",e.getMessage());
			assertEquals("Negatives are not allowed -1 -2 -3",e.getMessage());
		}
	}
	@Test
	public void getAddCallCount() {
		int a = StringCalculator.GetCalledCount();
		System.out.print(a);
		assertEquals(5,a);
	}
}
