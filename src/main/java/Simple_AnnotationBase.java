import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.helper_file.FileReadManager;

public class Simple_AnnotationBase extends Base_Class {

	@BeforeSuite
	private void SystemSetProperty() {
		getBrowser("chrome");

	}

	@BeforeTest

	private void browserlaunch() {

		driver.manage().window().maximize();
	}

	@BeforeClass

	private void getUrl() throws IOException, InterruptedException {
		geturl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
		sleep();

	}

	@BeforeMethod

	private void login() {
		inputText(driver.findElement(By.name("username")), "Nithiya90");
		inputText(driver.findElement(By.id("password")), "6B980P");
	}

	@Test

	private void click() {
		clickbutton(driver.findElement(By.id("login")));
	}

	@AfterMethod

	private void logout() {
		System.out.println("logout");

	}

	@AfterClass

	private void homepage() throws IOException {

		geturl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
	}

	@AfterTest

	private void closes() {
		driver.close();

	}

}
