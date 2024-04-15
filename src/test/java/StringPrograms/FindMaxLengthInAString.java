package StringPrograms;

import org.testng.annotations.Test;

public class FindMaxLengthInAString {

	public static void main(String[] args) {

		String[] s = { "ab", "abc", "bd","svcbndb", "abcd", "abcde", "cd" };
		String max_Length = s[0];

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > max_Length.length()) {
				max_Length = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == max_Length.length()) {
				System.out.println(s[i] + " ");
			}
		}
	}
}
