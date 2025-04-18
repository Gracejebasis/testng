package testng;

import org.testng.annotations.Test;

public class parallel2 {
	

	@Test
	public void d() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("d");
	}
	
	@Test
	public void e() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("e");
	}
	
	@Test
	public void f() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("f");
	}
}
