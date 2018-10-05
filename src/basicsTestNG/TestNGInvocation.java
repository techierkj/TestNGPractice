package basicsTestNG;

import org.testng.annotations.Test;

public class TestNGInvocation {

	@Test(invocationCount=10)
	public static void testA1() {
		System.out.println("Invocation Check");
	}
	@Test(invocationCount=10,invocationTimeOut=3000)
	public static void testA2() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Invocation Check With TimeOut");
		//org.testng.internal.thread.ThreadTimeoutException
	}
}