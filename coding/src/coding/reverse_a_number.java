package coding;

import java.util.Scanner;

public class reverse_a_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number you want to reverse : ");
		
		int num =sc.nextInt();
		
		int rev=0;
		
//		using alogorithm
		
		while (num!=0)
		{
			rev= rev*10+num%10;
			num = num/10;
			
		}
		System.out.println("the reverse number is : "+rev);
	}

}
