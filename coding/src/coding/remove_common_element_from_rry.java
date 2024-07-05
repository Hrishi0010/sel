package coding;

import java.util.HashMap;

public class remove_common_element_from_rry {

	public static void remove_commom(int n1[], int n2[]) {

		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		for (int i = 0; i < n1.length; i++) {
			if (hmp.containsKey(n1[i])) {
				hmp.put(n1[i], hmp.get(n1[i]) + 1);

			}
			else {
				hmp.put(n1[i],1);
			}

		}
		
		for (int i = 0; i < n2.length; i++) {
			if (hmp.containsKey(n2[i])) {
				hmp.remove(n2[i]);
				System.out.println(n2[i]);
				
			}
		}

	}
	
	public static void main(String[] args) {
		
		int n1[] = new int[] {1,2,4,5,7};
		int n2[]= new int[] {5,8,2,9};
		
		remove_commom(n1, n2);
		
		
	}

}
