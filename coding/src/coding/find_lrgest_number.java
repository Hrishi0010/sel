package coding;

import java.util.Scanner;

public class find_lrgest_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plse enter first number");
		int b = sc.nextInt();
		System.out.println("plese enter second number");
		int c = sc.nextInt();
		System.out.println("plese enter second number");
		int d = sc.nextInt();

		if (b > c & b > d) {
			System.out.println(b + "  is the lrgest number");
		} else if (c > b & c > d) {
			System.out.println(c + "  is the lrgest number");
		} else {
			System.out.println(d + "  is the lrtgest number");
		}
	}

}
