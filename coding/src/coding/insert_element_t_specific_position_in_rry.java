package coding;

import java.util.Arrays;

public class insert_element_t_specific_position_in_rry {

	public static int[] insert(int n, int array[], int pos, int x) {
		int i;
		int newarray[] = new int[n + 1];

		for (i = 0; i < n + 1; i++) {
			if (i < pos - 1) {
				newarray[i] = array[i];

			} else if (i == pos - 1) {
				newarray[i] = x;
			} else {
				newarray[i] = array[i - 1];

			}

		}
		return newarray;

	}

	public static void main(String[] args) {

		int n = 10;

		int array[] = { 1, 2, 3, 5, 4, 8, 7, 5, 6 };

		System.out.println("Initial arry:" + Arrays.toString(array));

		int x = 50;

		int pos = 5;
		array = insert(n, array, pos, x);
		System.out.println(+x + pos + Arrays.toString(array));
	}

}
