package coding;

public class fiboncci_series {

	public static void main(String[] args) {
		int n2 = 0;
		int n3 = 1;
		int sum;
//0 1  1 2 3 5 8 13 21		sum of fist 2 numbers nd go on
		for (int i = 2; i < 18; i++) {
			sum = n2 + n3;//1
			System.out.println(sum);
			n2 = n3;//1
			n3=sum;//1
			
		
		}
	}
}
