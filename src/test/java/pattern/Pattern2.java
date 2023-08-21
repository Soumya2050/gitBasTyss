package pattern;

public class Pattern2 {
	
	
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>j) {//1>1f,1>2f,1>3f,1>4,2,2>1
					System.err.print("");
				}else
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

//* * * *
//
//
//
//
//
//
