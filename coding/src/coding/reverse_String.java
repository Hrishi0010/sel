package coding;

public class reverse_String {

	public static void main(String[] args) {
		String s = "bcde";
		String rev= "";
		
		int len = s.length();
		
		for (int i = len-1; i >=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
