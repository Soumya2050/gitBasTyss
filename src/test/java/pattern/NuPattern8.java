package pattern;

public class NuPattern8 {
//	1      
//	1 2     
//	1 2 3    
//	1 2 3 4   
//	1 2 3 4 5  
//	1 2 3 4 5 6 
	public static void main(String[] args) {

		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print(j+1+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
