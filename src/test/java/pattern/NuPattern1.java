package pattern;

public class NuPattern1 {
//	0      
//	1 2     
//	3 4 5    
//	6 7 8 9   
//	0 1 2 3 4  
//	5 6 7 8 9 0
	public static void main(String[] args) {
		int k = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i >= j) {
					System.out.print(k++%10 + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
