
package coding;

import java.util.HashMap;
import java.util.Map;

public class HshMp_count_chr_inString {

	public static void count_chr(String inputstring) {

		HashMap<Character, Integer> hmp = new HashMap<>();
		char str_rry[] = inputstring.toCharArray();
		for (char ch : str_rry) {
			if (hmp.containsKey(ch)) {
				hmp.put(ch, hmp.get(ch) + 1);

			} else {
				hmp.put(ch, 1);
			}
		}
		for (Map.Entry entry : hmp.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

	public static void main(String[] args) {

		String inputstring = "Hrishikesh Rjesh Kokre";

		count_chr(inputstring);

	}
}
