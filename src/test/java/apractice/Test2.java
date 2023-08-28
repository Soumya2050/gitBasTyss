package apractice;

import org.testng.annotations.Test;

public class Test2 {

	
	@Test(priority = 1)
	public void b() {
		System.out.println("b");
	}
	@Test(priority = 2)
	public void a() {
		System.out.println("a");
	}
	
	@Test(priority = 3)
	public void c() {
		System.out.println("c");
		
	}
	@Test(priority = 4)
	public void e() {
		System.out.println("e");
	}
	@Test(priority = 5)
	public void d() {
		System.out.println("d");
	}
	
	@Test(priority = 6)
	public void f() {
		System.out.println("f");
	}
	
}
