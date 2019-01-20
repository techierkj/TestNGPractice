package basicsTestNG;

import org.testng.annotations.Test;

public class TestNGDependsOnGroup {

	@Test(dependsOnGroups = "sanity")
	public static void testB() {
		System.out.println("Depends on sanity group");
	}

	@Test(groups="sanity")
	public static void testA() {
		int a = 9 / 0;
	}

	@Test
	public static void testA1() {
		System.out.println("No dependency");
	}

	@Test(dependsOnGroups = "sanity")
	public static void testC() {
		System.out.println("Depends on sanity group");
	}

	@Test(dependsOnGroups = "sanity")
	public static void test() {
		System.out.println("Depends on sanity group");
	}
}