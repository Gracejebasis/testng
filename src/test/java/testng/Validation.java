package testng;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation {

	
	//assert equals,assert true,assert false, assert null, assert notnull
	@Test
	public void user() {
		//hardassert
		String s= "Grace";
	  Assert.assertEquals(s, "grace");
		System.out.println("user");
	}
	

	@Test
	public void pass() {
		//softassert
		String s= "Grace";
		SoftAssert sa=new SoftAssert();
		sa.assertAll();
		sa.assertEquals(s, "grace");
	    System.out.println("pass");
	}
	
	@Test
	public void Test1() {
		String s="Grace";
		Assert.assertTrue(s.contains("s"));
		{
		System.out.println(true);
		}
	}
	
	
	@Test
	public void Test2() {
		String s="Grace";
		Assert.assertFalse(s.contains("s"));
		{
		System.out.println(false);
		}
	}
	
	
	@Test
	public void Test3() {
	
		Assert.assertNull("grace");
		{
		System.out.println("null");
		}
	}
	
	@Test
	public void Test4() {
	
		Assert.assertNotNull("grace");
		{
		System.out.println("not null");
		}
	}
	
	
	@Test
	public void login() {
		System.out.println("login");
	}
	


	

}
	