package pattern;

public class Pattern6 {
//	a     
//	b c    
//	d e f   
//	g h i j  
//	k l m n o 
	
	public static void main(String[] args) {
		
		char ch = 'a';
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i>=j)
					System.out.print(ch++ +" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
