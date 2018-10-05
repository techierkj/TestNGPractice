package basicsTestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestNGExpectedExceptions {

	@Test(invocationTimeOut = 3000, expectedExceptions = ThreadTimeoutException.class)
	public static void testA2() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Invocation Check With TimeOut");
		// org.testng.internal.thread.ThreadTimeoutException
		// expectedException = Helps in ignoring exception/TestCase will not get
		// failed
	}
}