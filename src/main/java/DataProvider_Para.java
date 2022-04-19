import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Para {
	
	
	
	@Test(dataProvider= "testdata")
	private void credentials(String name, String pass) {
		
		System.out.println(name);
		System.out.println(pass);
		

	}
	
	
	@DataProvider
	private Object[][] testdata() {
		
		
		return new Object[][] {
			
			{"admin", "admin567"},
			{"root", "root567"},

	};
	
	}
	

}
