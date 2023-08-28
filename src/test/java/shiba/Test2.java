package shiba;

import org.testng.annotations.Test;

public class Test2 extends Test1 {

	public static void m1() {
		System.out.println("Hello ");
	}

//	  	* 
//	   * * 
//	  * * * 
//	 * * * * 
	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	@Test
	public void method2() {
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
}
