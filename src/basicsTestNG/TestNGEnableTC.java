package basicsTestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestNGEnableTC {

	@Test(enabled = true)
	public static void enable() {
		System.out.println("Include TC");
	}

	// enabled=false, will ignore test cases
	@Test(enabled = false)
	public static void disable() {
		System.out.println("Exclude TC");
	}

}