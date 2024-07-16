package coding;

public class reverse_String {

	public static void main(String[] args) {
		String s = "bcde";
	    // String rev = "";

		int len = s.length();

		for (int i = len; i > 0; i--) {
			//rev = rev + s.charAt(i-1);

		char rev =s.charAt(i-1);
		System.out.println(rev);
		
		}
	}

}

//using while loop

//	public static void reverse(String str) {
//		int i = str.length();
//
//		while (i > 0) {
//			System.out.println(str.charAt(i - 1));
//			i--;
//		}
//
//	}
//	
//	public static void main(String[] args) {
//		
//		String str ="bhfgv";
//		
//		reverse(str);
//	}
//}