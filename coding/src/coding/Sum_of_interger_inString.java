package coding;

public class Sum_of_interger_inString {

	
	public static int sum(String str) {
		String s = "0";
		int sum = 0;
		// red each character from String
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// if character is digit
			if (Character.isDigit(ch))
				s += ch;
			else {
				sum += Integer.parseInt(s);
				s = "0";

			}

		}
		return sum + Integer.parseInt(s);
	}

	public static void main(String[] args) {

		String str = "9yfh15jj16jn";

		System.out.println(sum(str));
	}
}
