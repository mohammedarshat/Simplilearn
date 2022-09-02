package Arrays_Questions;

public class Duplicate_Value {
	public static void duplicate(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.print(array[i] + " ");
				}
			}
		}

	}


	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 9, 4, 5, 2 };
		duplicate(arr);
	}

}
