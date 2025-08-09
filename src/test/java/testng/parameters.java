package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	@Parameters("a")
	@Test 
	public  void a(String a) {
	System.out.println("a :" + a);
		
	}
	@Parameters("b")
	@Test
	public void b(String b) {
		System.out.println("b :" + b);
			
		}
	@Parameters("c")
	@Test 
	public  void c(String c) {
		System.out.println("c :" + c);
			
		}
	

}



