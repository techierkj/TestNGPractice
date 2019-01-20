package basicsTestNG;

import org.testng.annotations.Test;

public class TestNGDescriptions {
	
	
	@Test(description="Navigate")
	public static void testA1() {
		System.out.println("A");
	}

	@Test(description="Browse")
	public static void testA2() {
		System.out.println("B");
	}

	@Test(description="Close")
	public static void testA3() {
		System.out.println("C");
	}

}
