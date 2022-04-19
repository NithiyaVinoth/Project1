import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.helper_file.FileReadManager;

public class Simple_AnnotationBase2 extends Base_Class {

	@BeforeSuite
	private void setProperty() {
		getBrowser("Chrome");
		System.out.println("Browser has launched");
	}

	@BeforeTest
	private void browselaunch() {
		driver.manage().window().maximize();
		System.out.println("Screen has been maximized");

	}

	@BeforeClass
	private void getUrl() {
		geturl("https://adactinhotelapp.com/");
		System.out.println("Page has been Opened.URL launched");

	}

	@Test
	private void Logindetails() {
		System.out.println("Login Credential Entered");
		inputText(driver.findElement(By.name("username")), "Nithiya90");
		inputText(driver.findElement(By.name("password")), "6B980P");

	}

	@AfterTest
	private void Logout() {
		System.out.println("Logout");
	}

	@AfterClass
	private void closeBrowser() {
		close();

	}

	@AfterSuite
	private void delete() {
		System.out.println("DeleteAllCookies");
	}

}
