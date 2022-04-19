import java.io.InterruptedIOException;

import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Excepted_Exception {

	@Test(timeOut=10000,expectedExceptions =  {ExpectedException.class, ThreadTimeoutException.class}) 
	private void Thread() throws InterruptedIOException, Throwable{
		System.out.println("Thread Output1");
		Thread.sleep(2000);
		System.out.println("Thread Output2");
		Thread.sleep(9000);
		System.out.println("Final output");
		}

	
	
	
	
	
	
	
	

}