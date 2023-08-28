package pattern;

public class Pattern5 {
//	a      
//	b b     
//	c c c    
//	d d d d   
//	e e e e e  
//	f f f f f f 
	public static void main(String[] args) {
		
		
		for(int i=0;i<=5;i++)
		{
			
			for(int j=0;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print((char)('a'+i)+" ");
					
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
