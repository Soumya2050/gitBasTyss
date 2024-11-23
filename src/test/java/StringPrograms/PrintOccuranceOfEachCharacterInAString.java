package StringPrograms;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class PrintOccuranceOfEachCharacterInAString {
//	@Test
	public void OccuranceOfEachCharacterInAString() {
		String str = "KANADA";
		char ch = 'A';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("This " + ch + " is occured " + count + " times in the string");
	}

//	@Test
	public void method2() {
		String str = "Kannada";
		String st = str.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}

		for (Character c : set) {
			int count = 0;
			for (int i = 0; i < st.length(); i++) {
				if (c == st.charAt(i)) {
					count++;
				}
			}
			System.out.println("this " + c + " is occured " + count + " in the string");
		}
	}
	
//	@Test
	public void occuranceofCharacterUsingMap() {
		
		String str = "Kannada";
		String st = str.toLowerCase();
		
		LinkedHashMap<Character,Object> map = new LinkedHashMap<>();
		
		for(int i=0;i<st.length();i++) {
			map.put(st.charAt(i), null);
		}
		
		for(Map.Entry<Character,Object> m : map.entrySet()) {
			int count=0;
			for(int j=0;j<st.length();j++) {
				if(m.getKey().equals(st.charAt(j))) {
					count++;
				}
			}
			System.err.println(m.getKey()+" occures "+" "+count);
		}

	}
	
	@Test
	public void occuranceofCharacterUsingSet() {
		
		String s="aabbccddeeeabscd";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for (Character character : set) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(character.equals(s.charAt(j))) {
					count++;
				}
			}
			System.out.print(character+""+count);
		}
	}

}
