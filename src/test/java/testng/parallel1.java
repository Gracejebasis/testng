package testng;

import org.testng.annotations.Test;

public class parallel1 {

	
	@Test
	public void a() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("a");
	}
	
	@Test
	public void b() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("b");
	}
	
	@Test
	public void c() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("c");
	}
}
