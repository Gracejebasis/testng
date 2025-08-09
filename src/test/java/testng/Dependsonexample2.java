package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonexample2 {
	
	

	    @Test
	    public void login() {
	        System.out.println("Login Test");
	        Assert.fail("Login failed");  // Simulate a failure
	    }

	    @Test(dependsOnMethods = "login")
	    public void addToCart() {
	        System.out.println("Add to Cart Test");
	    }

	    @Test
	    public void checkout() {
	        System.out.println("Checkout Test");
	    }
	}


