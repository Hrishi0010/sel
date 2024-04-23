package coding;

import java.util.Scanner;

public class prime_number {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter rthe number :  ");
		int num = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
			 if (count==2) {
				System.out.println(num+" it is prime number");
			}
			else {
				System.out.println(num+  "  not  prime number");
			}

		
	}
}
