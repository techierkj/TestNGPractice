package basicsTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGPriority {
	static WebDriver driver;

	@BeforeMethod
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2)
	public void getTitle() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void checkElementClickable() throws InterruptedException {
		Boolean b = driver.findElement(By.xpath("//*[@type='submit']")).isEnabled();
		System.out.println("Is Enabled:-" + b);
		Thread.sleep(2000);

	}
	@Test(priority=1)
	public void checkLogoPresence() throws InterruptedException {
		Boolean c = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("Is Displayed:-" + c);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
