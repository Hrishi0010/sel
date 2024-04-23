package coding;

import java.util.Scanner;

public class plindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter number");
		int num=sc.nextInt();
		
		int org_num=num;//23432
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;//2  
			num=num/10;//2343
		}
		
		if (org_num==rev) {
			System.out.println(org_num+ " it is  plindrome");
		}
		else {
			System.out.println(org_num+   "not plindrome");
		}
	}

}
