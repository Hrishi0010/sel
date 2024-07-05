package coding;

import java.util.Scanner;

public class string_is_plindrome {

	public static void main(String[] args) {

		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + "it is plindrome");

		} else {
			System.out.println(str + "not plindrome");
		}

	}
}
