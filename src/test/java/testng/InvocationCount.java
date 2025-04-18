package testng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void user() {
		System.out.println("user");
	}
	
}
