package basicsTestNG;

import org.testng.annotations.Test;

public class TestNGTimeOut {

	@Test(timeOut = 4000)
	public void method1() throws InterruptedException {
		Thread.sleep(5000); // TC will fail, as execution time> Test case
							// timeout defined
		System.out.println("Method 1");
	}
	
	// Can also use timeout to control Infinite Loop
	@Test(timeOut = 1000)
	public void method2() {
		while(2>1){
			System.out.println("A");
		}
	}
}