package numberProgram;

import org.testng.annotations.Test;

public class PrintThePrimeNumberInanGivenArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
//		output= 2 3 5 7 11 13 17 19
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(a[i]+" ");
			}
			
		}
	}
	
	@Test
	public void printThePrimeNumberInAnArray() {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
