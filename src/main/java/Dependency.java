

import org.testng.annotations.Test;
public class Dependency {
	
	
	
	
	
	
	
	@Test
	private void courseoffer() {
		System.out.println("Course Offer 40%");
		}

	@Test
	private void newyearoffer() {
		System.out.println("New Year Offer 20%");
	}
	@Test(dependsOnMethods="courseoffer")
		private void coursefees() {
		System.out.println("Fees Details");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
