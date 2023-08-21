package pattern;

public class Pattern4 {
//	a      
//	a b     
//	a b c    
//	a b c d   
//	a b c d e  
//	a b c d e f 

	public static void main(String[] args) {
		
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+j)+" ");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
