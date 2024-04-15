package StringPrograms;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void methotestEngineerd() {
		String s = "testEngineer";
		String s1 = s.substring(4);
		System.out.println(s1);
		String s2 = s.substring(0, 4);
		System.out.println(s2);
		String s3 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s3 += s1.charAt(i) + "";
		}
		System.out.println(s2 + s3);
	}

	@Test
	public void method() {
		String s = "SharukhanShan";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two char");
		String str = sc.next();
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(s);
		int count = 0;
		while (m.find()) {
			count++;
		}

		System.out.println(str + "--->" + count);
	}

	@Test
	public void method3() {
		String s = "abcabcaaacccc";
		int count = 0;
		char input1 = 'c';
		char input2 = 'a';
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (map.containsKey(s.charAt(i)) == false) {
				map.put(s.charAt(i), count);
			}
		}
//		 System.out.println(map);
		for (Entry<Character, Integer> en : map.entrySet()) {
			if (en.getKey() == input1 || en.getKey() == input2) {
				System.out.println(en.getKey() + " repeated " + en.getValue() + " times");
			}

		}
	}

	@Test
	public void method4() {
		String s = "SharukhanShan";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (!(map.containsKey(s.charAt(i)))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + "-->" + map.get(str.charAt(i)));
		}
	}

	@Test
	public void method5() {
		String s = "SharukhanShanSha";
		String exp = "Sha";
		int count = 0;
		for (int i = 0; i <= s.length() - exp.length(); i++) {
			String act = s.substring(i, i + exp.length());
			if (act.equalsIgnoreCase(exp)) {
				count++;
			}
		}
		System.out.println(exp + "--->" + count);

	}

	@Test
	public void reverseArrayWithoutUsingLength() {
		String s = "wwwcarrwallecom";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!(map.containsKey(s.charAt(i)))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i) + 1));
			}
		}
		System.out.print(map);
	}

	@Test
	public void method6() {
		String s = "aaaabbbbccccaaaa";
		ArrayList<Object> list = new ArrayList<>();

		char ch = s.charAt(0);
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			} else {
				list.add(ch);
				list.add(count);
				ch = s.charAt(i);
				count = 1;
			}
		}
		for (Object object : list) {
			System.out.print(object);
		}
	}
	
	@Test
	public void method7() {
		String s = "aaaabbbbccccaaaa";//wwwcarrwallecom
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}else {
					i=j-1;
					break;
				}
			}
			System.out.print(s.charAt(i)+":"+count);
		}
	}

}
