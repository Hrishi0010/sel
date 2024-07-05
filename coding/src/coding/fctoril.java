package coding;

import java.util.Scanner;

public class fctoril {
	static int factorial(int b) {

		int fact = 1;

		for (int i = 1; i <= b; i++) {
			fact *= i;

		}
		return fact;

	}

	public static void main(String[] args) {
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fctoril number");
		b=sc.nextInt();

		System.out.println(factorial(b));
	}
}
