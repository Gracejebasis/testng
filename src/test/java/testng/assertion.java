package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {
	
	public class Testclass1 {
		
		@Test 

		public  void hardassert() {
			String s ="aiite";
			Assert.assertEquals(s, "aii");
			System.out.println(s);
			
		}

			
		}
		@Test 
		public  void softassert() {
			String s ="aiite";
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(s, "aii");
			System.out.println("softassert continues");
			sa.assertAll();
	
			
		}
}
