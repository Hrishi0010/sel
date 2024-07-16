package coding;

public class bubble_sort {

	public static void array(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}

	public static void sort(int array[]) {

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("in sorted order");
		array(array);
	}

	public static void main(String[] args) {
		int given_number = 8;
		int array[] = new int[] { 5, 7, 6, 3, 1, 2, 9 };

		int newarray[] = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			newarray[i] = array[i];

		}
		newarray[newarray.length - 1] = given_number;

		array(array);
		System.out.println("");
		sort(newarray);
	}
}
