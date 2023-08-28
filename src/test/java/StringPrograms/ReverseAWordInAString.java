package StringPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ReverseAWordInAString {

	@Test
	public void reverseWordInaString() {
		String str = "i am a god boy";
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}

	}

	@Test(priority = 1)
	public void reverseEachwordInAString() {

		String str = "i am a god boy";
		String s1 = "";
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			StringBuilder sb = new StringBuilder(s[i]);

			s1 += sb.reverse().toString() + " ";
		}
		System.out.println(s1);
	}

	@Test(priority = 2)
	public void reverseAwordInAStringMethod2() {
		String str = "I am a software Engineer";
		String[] s = str.split(" ");
		String rev = "";
		for (String string : s) {
			String r = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				r = r + string.charAt(i);
			}
			rev = rev + " " + r;
		}
		System.err.print(rev);
	}

	@Test(priority = 3)
	public void reverseAwordInAstringWithoutUsingSplit() {
		String str = "mY name is SoumyaRanjan";
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		System.out.print(s);
	}

	@Test
	public void reverseEachWordInAStringmethod() {
		String s = "I am a Software engineer";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String st = str[i];
			for (int j = st.length() - 1; j >= 0; j--) {
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
	}

	@Test
	public void reverseCharactersOfwordsinSentenceWithoutSplitMethod() {
//		System.err.println("reverseCharactersOfwordsinSentenceWithoutSplitMethod");
		String s = "I am a software engineer";
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			al.add(s.charAt(i));
		}
		// System.out.println(al);
		for (int i = al.size() - 1; i >= 0; i--) {
			Character c = (Character) al.get(i);
			System.out.print(c);
		}
	}
}
