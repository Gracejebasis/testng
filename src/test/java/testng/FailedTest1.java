package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest1 {
	
	@Test(retryAnalyzer=FailedTest_logic.class)
	public void user() {
		String s= "Grace";
	  Assert.assertEquals(s, "grace");
		System.out.println("user");
	}
	
	@Test
	public void a() {
		System.out.println("a");
	}
	
	@Test
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void c() {
		System.out.println("c");
	}
}

