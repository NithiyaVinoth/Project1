import java.util.concurrent.TimeUnit;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Parallel {

	@Test
	public void facebook() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();

	}

	@Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
	public void instagram() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(5000);
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();

	}
	
	

	@Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
	public void amazon() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(5000);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

	}
	
}
