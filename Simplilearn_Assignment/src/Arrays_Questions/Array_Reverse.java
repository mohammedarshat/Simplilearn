package Arrays_Questions;

public class Array_Reverse {
//	public static void reverse(int array[]) {
//		int temp;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//	}
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.print(array[i]+ " ");
//		}
//}
	public static void reverse(int[] array) {
		for(int i =  array.length-1 ;  0 <= i ; i--) {
			System.out.print(array[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverse(arr);
	}

}
