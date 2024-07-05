package coding;

import java.util.HashMap;

public class to_remove_duplicte_from_string {

	public static char[] duplicte(char ch[], int n) {
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
//		char ch[] = str.toCharArray();

		String str= "";
		for (int i = 0; i < n; i++) {

			if (!hmp.containsKey(ch[i])) {
				str += ch[i];
				hmp.put(ch[i], 1);
			}

		}
		return str.toCharArray();

	}

	public static void main(String[] args) {
		char ch[] = "hrishikesh Rjesh Kokre".toCharArray();
//		String str="hrishikesh Rjesh Kokre";
//		char ch[] =str.toCharArray(); 

		int n = ch.length;
		System.out.println(duplicte(ch, n));
	}
}
