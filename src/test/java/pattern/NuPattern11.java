package pattern;

public class NuPattern11 {
//	0      
//	1 0     
//	2 1 0    
//	3 2 1 0   
//	4 3 2 1 0  
//	5 4 3 2 1 0 
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print((i-j)+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
