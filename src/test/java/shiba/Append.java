package shiba;

import org.testng.annotations.Test;

public class Append {

	@Test
	public void append() {
		int [] a={5,0,3,0,8,0};
		int b[]=new int[a.length];
		int x=0;
		int y=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]== 0) {
				b[y]=a[i];
				y--;
			}
			else {
				b[x]=a[i];
				x++;
			}		
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
