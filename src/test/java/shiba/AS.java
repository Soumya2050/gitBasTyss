package shiba;

public class AS {
		
	public static void main(String[] args) {
		String s="mensuration";	
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.toLowerCase().charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}
		}
		System.out.println("The string contains "+count+" vowels");
	}
	
}
