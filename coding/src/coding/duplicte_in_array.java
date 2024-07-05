package coding;

public class duplicte_in_array {

	public static void duplicate(int array[])
	{
	
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int array[]= new int[] {1,2,5,7,5,1};
		
		duplicate(array);
		
	}
}
