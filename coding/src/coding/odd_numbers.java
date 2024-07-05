package coding;

public class odd_numbers {
	
	public static void odd(int num) {
		
		for (int i = 1; i <=num; i++) {
			if(i%2!=0)
				System.out.println(i+"");
		}
		
	}
	
	public static void main(String[] args) {
		int num=100;
		
		odd(num);
	}
	

}
