package coding;

public class lrgest_nd_smllest_number {

	public static void lrge_nd_smll(int b[]) {

		int lrge, smll;
		lrge = smll = b[0];
		for (int i = 0; i < b.length; i++) {
			if ( b[i]>lrge) {
				lrge = b[i];

			}
			if (b[i]<smll) {
				smll=b[i];
				
			}

		}

		System.out.println(lrge+"is the lrgest number");
		System.out.println(smll+"is the smllest number");
	}

	public static void main(String[] args) {
		int b[]=new int[] {1,5,4,7,9,0,2};
		
		lrge_nd_smll(b);
	}
}
