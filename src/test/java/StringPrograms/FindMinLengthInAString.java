package StringPrograms;

import org.testng.annotations.Test;

public class FindMinLengthInAString {

	public static void main(String[] args) {

		String[] s = { "a","ab", "abc", "bd","b","abcd", "abcde", "cd" };
		String minLen = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<=minLen.length()) {
				minLen=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==minLen.length()) {
				System.out.println(s[i]);
			}
		}
	}

	@Test
	public void FindMinLengthInAStringMethod2() {
		
		String[] s = { "ab", "abc", "bd", "abcd", "abcde", "cd","a" };
		String min_Length = s[0];
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min_Length.length()) {
				min_Length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length() == min_Length.length()) {
				System.out.println(s[i]+" ");
//				break;
			}
		}
	}
	@Test
	public void a() {
		String s="vcbnm";
		int count=0;
		for(char c : s.toCharArray()) {
			count++;
		}
		System.out.println("Method 1 :- "+count);
		int i=0;
		int count1=0;
		while(true) {
			try {
				s.charAt(i);
				count1++;
				i++;
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("Method 2 :- "+count1);
	}
}
