package arrayPrograms;

public class RemoveDuplicateWithoutUsingCollection {
	
	public static void main(String[] args) {
		
		int a[]= {1,1,2,2,3,3,4,4,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.print(a[i]);
			}
		}
	}

}
