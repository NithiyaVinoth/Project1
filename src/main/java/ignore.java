import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore {

	public WebDriver driver;

	@BeforeSuite

	private void SystemsetProperty() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

	}

	@BeforeTest

	private void browser_Launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeClass

	private void getUrl() {
		driver.get("https://adactinhotelapp.com/");

	}

	@BeforeMethod

	private void login() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("Nithiya90");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("6B980P");

	}

	@Ignore
	@Test
	private void facebook()

	{
		driver.get("https://www.facebook.com/");

	}

	@Test(enabled = false)
	private void amazon() {
		driver.get("https://www.amazon.in/");

	}

	@Test
	private void google() {
		driver.get("https://www.google.com/");

	}

	@Test
	private void gmail() {
		driver.get("https://www.gmail.com/");

	}

	@AfterMethod

	private void close() {
		driver.close();

	}

	@AfterTest

	private void logout() {
		System.out.println("Log out");

	}

	@AfterSuite

	private void Delete_Cookies() {
		driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.navigate().to("https://www.gmail.com/");
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
