package testng;


import org.testng.annotations.Test;

//Sample check

public class dependsOn {

	@Test
	public void user() {
		System.out.println("user");
	}
	

	@Test(dependsOnMethods = "user")
	public void pass() {
		System.out.println("pass");
	}

}
