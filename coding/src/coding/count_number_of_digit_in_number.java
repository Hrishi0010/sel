package coding;

import java.util.Scanner;

public class count_number_of_digit_in_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to get digit count");
		int num =sc.nextInt();
		
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("there re "+count+ " digit in  number  ");
	}

}
