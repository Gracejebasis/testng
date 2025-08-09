package testng;

import org.testng.annotations.Test;

public class DependsOn {

	@Test (enabled=false)

	public  void a() {
	System.out.println("a");
		
	}
	@Test (dependsOnMethods ="a")
	public void b() {
		System.out.println("b");
			
		}
	
	@Test(dependsOnMethods ="b")
	public  void c() {
		System.out.println("c");
			
		}
	

}

