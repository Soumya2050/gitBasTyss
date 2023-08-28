package practice;

public class Test2 {
	
	public static void main(String[] args) {
		
		String s = "a1b2c3d4";// output=10
		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9') {
				sum+=ch-48;//49-48=1+2+3+4
			}
		}
		System.out.println(sum);
		
	}
}
