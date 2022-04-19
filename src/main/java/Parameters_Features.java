import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Features {
	
	
	
	@Parameters({"uname","Pass"})//optional we use if we  dont want pass from xml need to take from prog (eg pass L/U) 
	@Test
	private void credentials(String uname,@Optional("56777") int Pass) {
		
		System.out.println(uname);
		System.out.println(Pass);
		

	}
	
	
	
	
	
	
	
	

}
