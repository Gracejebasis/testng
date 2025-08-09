package testng;

import org.testng.annotations.Test;

public class exclude {
	
	@Test (groups = {"smoke", "reg"})

	public  void a() {
	System.out.println("a");
		
	}
	@Test (groups = {"sanity", "reg"})
	public void b() {
		System.out.println("b");
			
		}
	
	@Test (groups = {"smoke"})
	public  void c() {
		System.out.println("c");
			
		}
	

}

