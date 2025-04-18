package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest2 {
	
	@Test
	public void user() {
		String s= "Grace";
	  Assert.assertEquals(s, "grace");
		System.out.println("user");
	}
	
	@Test
	public void d() {
		System.out.println("d");
	}
	
	@Test
	public void e() {
		System.out.println("e");
	}
	
	@Test
	public void f() {
		System.out.println("f");
	}
}



