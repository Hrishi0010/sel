package coding;


public class disrium {
	
	public static void printDisrium(int n) {
		int digit = Integer.toString(n).length();
		int sum=0;
		int x= n;
		while (x!=0) {
			int r=x%10;
			sum = (int) (sum+Math.pow(r, digit--));
			x=x/10;
			
		}
		if (sum==n) {
			System.out.println(n+"disrrium");
		}
		else {
			System.out.println(n+"not dsisrum");
		}
	}
	
	public static void main(String[] args) {
		int n=125;
		printDisrium(n);
	}

}
