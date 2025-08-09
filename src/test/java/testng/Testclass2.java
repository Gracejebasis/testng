package testng;

import org.testng.annotations.Test;

public class Testclass2 {

	@Test (groups = {"smoke", "reg"})

	public  void d() {
	System.out.println("d");
		
	}
	@Test (groups = {"sanity", "reg"})
	public  void e() {
		System.out.println("e");
			
		}
	
	@Test (groups = {"smoke"})
	public  void f() {
		System.out.println("f");
			
		}
	

}

