package basicsTestNG;

import org.testng.annotations.Test;

public class TestNGDependsOnMethods {

	@Test(dependsOnMethods = "testA")
	public static void testB() {
		System.out.println("Depends on A");
	}

	@Test
	public static void testA() {
		int a = 9 / 0;
	}

	@Test
	public static void testA1() {
		System.out.println("No dependency");
	}

	@Test(dependsOnMethods = "testA")
	public static void testC() {
		System.out.println("Depends on A");
	}

	@Test(dependsOnMethods = "testA")
	public static void test() {
		System.out.println("Depends on A");
	}
}