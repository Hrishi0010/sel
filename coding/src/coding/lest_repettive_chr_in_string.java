package coding;

import java.util.HashMap;
import java.util.Map;

public class lest_repettive_chr_in_string {

	public static void lest_repeted(String str) {

		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (hmp.containsKey(c)) {
				hmp.put(c, hmp.get(c) + 1);
			} else {
				hmp.put(c, 1);
			}

		}
		for (Map.Entry<Character,Integer> entry : hmp.entrySet()) {
			if (entry.getValue()<=1) {
				System.out.println(entry.getKey()+"");
				
			}

		}
	}

	public static void main(String[] args) {
		String str = "hbhfsdfjikbndgbsdfjgj";

		lest_repeted(str);

	}

}
