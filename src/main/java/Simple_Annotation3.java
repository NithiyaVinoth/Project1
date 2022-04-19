import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation3 {
	
	
	@BeforeSuite
	private void setProperty() {
		
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
	
	
private void credentials() {
	

}
	
	@Test(priority= 0)
	
	private void fipKart() {
		
	}
	
	@AfterMethod
	
	private void logout() {
		

	}
}




