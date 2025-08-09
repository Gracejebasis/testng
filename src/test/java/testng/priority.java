package testng;

import org.testng.annotations.Test;

public class priority {
	
	@Test (priority=2)

	public  void a() {
	System.out.println("a");
		
	}
	@Test (priority=3)
	public void b() {
		System.out.println("b");
			
		}
	
	@Test (priority=1)
	public  void c() {
		System.out.println("c");
			
		}
	

}



