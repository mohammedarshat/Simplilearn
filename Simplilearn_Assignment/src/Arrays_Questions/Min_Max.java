package Arrays_Questions;

public class Min_Max {
		// Write a java program to find the max and min value of in an array
		public static void printMinMaxInArray(int[] arr) {
			int min = arr[0];
			int max = arr[0];

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.print("Ans. 3)\t\t");
			System.out.println("Min: " + min + ", Max: " + max);
		}
		
	public static void main(String[] args) {
		int[] arr = {3,2,1,2};
		printMinMaxInArray(arr);
	}
}
