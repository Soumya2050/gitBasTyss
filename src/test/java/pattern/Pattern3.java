package pattern;

public class Pattern3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.err.print("");
			}
			for(int k=1;k<=i;k++) {
				System.err.print("* ");
			}
			System.out.println();
		}
	}
}
