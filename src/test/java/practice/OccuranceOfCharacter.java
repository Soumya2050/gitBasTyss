package practice;

import java.util.*;

import org.testng.annotations.Test;

public class OccuranceOfCharacter {
	
	public static void main(String[] args) {
		
		String s="selenium";
		char ch[]=s.toCharArray();
		
		LinkedHashSet<Character>set = new LinkedHashSet<>();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		
		for (Character character : set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(character==ch[i]) {
					count++;
				}
			}
			System.out.println(character+"---->"+count);
		}
	}
	
	@Test
	public void method2() {
		
		String s="aabbccaaaddbbdc";
		char ch[]=s.toCharArray();
		HashMap<Character, Integer>map = new LinkedHashMap<>();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);
		
	}
	@Test
	public void a() {
		String s="abcd";
		String s2="1123";
		String s1=s.substring(0,s2.length());
		
		String s3="";
		String s4=s.substring(s2.length());
		for(int i=0;i<s1.length();i++)
		{
			s3+=s1.charAt(i)+""+s2.charAt(i);
		}
		System.out.println(s3+s4);
	}
	@Test
	public void anagramString() {
		String  s="anagram";
		String s1="garaman";
		
		if(s.length()==s1.length()) {
			
			char ch[]=s.toCharArray();
			char ch1[]=s1.toCharArray();
			
			Arrays.sort(ch);
//			System.out.println(Arrays.toString(ch));
			Arrays.sort(ch1);
//			System.out.println(Arrays.toString(ch1));
			
			if(Arrays.equals(ch, ch1)) {
				System.out.println("This is an anagram number");
			}else {
				System.out.println("This not an anagram number ");
			}
		}else {
			System.out.println("The length is not same");
		}
		
	}
}
