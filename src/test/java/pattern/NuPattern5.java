package pattern;

public class NuPattern5 {
//	0     
//	1 1    
//	2 2 2   
//	3 3 3 3  
//	4 4 4 4 4 
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print(i + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
