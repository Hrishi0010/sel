package coding;

import java.util.Iterator;

public class count_chr_inString {

	public static int count_chr(String str, char c) {

		String s = "";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {

				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {

		String str = "geeks";

		char c = 'k';

		System.out.println(count_chr(str, c));
	}
}
