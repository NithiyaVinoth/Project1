import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation1 {

	@BeforeSuite
	private void SystemsetProperty() {

		System.out.println("System set property");
	}

	@BeforeTest

	private void browserlaunch() {
		System.out.println("Chrome Browser");

	}

	@BeforeClass

	private void getUrl() {
		System.out.println("Url launch");

	}

	@BeforeMethod

	private void login_credentials() {
		System.out.println("login");

	}

	@Test(priority = 1, invocationCount = 3)

	private void fipKart() {
		System.out.println("fipKart");
	}

	@Test(priority = 0)

	private void Facebook() {
		System.out.println("Facebook");
	}

	@Test(priority = -1)

	private void Amazon() {
		System.out.println("Amazon");
	}

	@AfterMethod

	private void logout() {
		System.out.println("logout");

	}

}
