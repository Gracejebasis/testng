package testng;

import org.testng.annotations.Test;

public class Test1group {

	
	@Test(groups= {"sanity" , "reg"})
	public void user() {
		System.out.println("user");
	}
	

	@Test(groups= {"smoke", "reg"})
	public void pass() {
		System.out.println("pass");
	}

	@Test(groups= {"sanity" , "reg"})
	public void login() {
		System.out.println("login");
	}

}

