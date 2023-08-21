package pattern;

public class Pattern7 {
//	a       
//	b c      
//	c d e     
//	d e f g    
//	e f g h i   
//	f g h i j k  
//	g h i j k l m 

	public static void main(String[] args) {
		
		char ch = 'a';
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				if(i>=j)
				{
					System.out.print((char)(ch+i+j)+" ");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
