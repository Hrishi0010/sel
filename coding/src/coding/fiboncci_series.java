package coding;

public class fiboncci_series {

	public static void main(String[] args) {
		int n2 = 0;// 1//1//2
		int n3 = 1;// 1//2//3
		int sum;
//0 1  1 2 3 5 8 13 21		sum of fist 2 numbers nd go on
		for (int i = 0; i < 18; i++) {
			sum = n2 + n3;// 0+1=1//2//3//5
			System.out.println(sum);// 1//2//3
			n2 = n3;// 1//1//2////3//
			n3 = sum;// 1//2//3//5

		}
	}
}
