package pattern;

public class NuPattern7 {
//	0     
//	1 1    
//	0 0 0   
//	1 1 1 1  
//	0 0 0 0 0 
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print(i%2+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
