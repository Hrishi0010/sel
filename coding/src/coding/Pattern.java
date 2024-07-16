package coding;

public class Pattern {

	public static void PrintPttern(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = n - i; j > 1; j--) {
				System.out.println(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 6;
		PrintPttern(n);

	}
}
