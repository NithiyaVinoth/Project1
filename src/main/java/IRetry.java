import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry {
	
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {
		
		
		
		String expected ="Dhiyaa";
		String actual ="Dhiyaa";
		
Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void password() {
		
		
		String expected ="56789";
		String actual ="5678";
		
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
