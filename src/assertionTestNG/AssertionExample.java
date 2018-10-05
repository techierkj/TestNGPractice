package assertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void methodA() {
		int a = 10;
		int b = 10;
		Assert.assertEquals(a, b);
	}

	@Test
	public void methodB() {
		int a = 10;
		int b = 11;
		Assert.assertEquals(a, b, "Mismatched");
		// java.lang.AssertionError: Mismatched expected [11] but found [10]
	}

	@Test
	public void methodC() {
		boolean a = true;
		Assert.assertTrue(a);
	}

	@Test
	public void methodD() {
		boolean a = false;
		Assert.assertTrue(a, "Not Matching");
	}

	@Test
	public void methodE() {
		boolean a = false;
		Assert.assertFalse(a);
	}

	@Test
	public void methodF() {
		int a = 10;
		int b = 11;
		Assert.assertNotEquals(a, b);
	}

	@Test
	public void methodG() {
		int a = 10;
		int b = 11;
		Assert.fail();
	}

	@Test
	public void methodH() {
		int a = 10;
		int b = 11;
		Assert.fail("Fail TestCase");

	}
}
