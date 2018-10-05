package basicsTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsSequencing {

	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("Before Suite ---- Set System Property");
	}

	@BeforeTest
	public static void beforeTest() {
		System.out.println("Before Test ---- Launch Driver");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class ----Enter URL");
	}

	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("Before Method ---- Login to the Website");
	}

	@Test
	public static void testB() {
		System.out.println("Test Case B");
	}

	@Test
	public static void testA() {
		System.out.println("Test Case A");
	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("After Method ---- Logout");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class ---- Delete All cookies");
	}

	@AfterTest
	public static void afterTest() {
		System.out.println("After Test ---- Close Browser");
	}

	@AfterSuite
	public static void afterSuite() {
		System.out.println("After Suite ----Generate Reports");
	}
}
/*
Output:-
Before Suite ---- Set System Property
Before Test ---- Launch Driver
Before Class ----Enter URL
Before Method ---- Login to the Website
Test Case A
After Method ---- Logout
Before Method ---- Login to the Website
Test Case B
After Method ---- Logout
After Class ---- Delete All cookies
After Test ---- Close Browser
After Suite ----Generate Reports

*/