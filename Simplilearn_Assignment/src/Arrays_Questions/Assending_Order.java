package Arrays_Questions;

import java.util.Arrays;

public class Assending_Order {
	public static void main(String[] args) {
		new Manual_Assending_Order().demo1();
		new Auto_Assending_Order().demo();
		new Manual_Dessending_Order().demo1();
	}
}
class Manual_Assending_Order{
	
	/* 2 , 3 , 1 , 4
	
	2 will check with all number
	1st 2 > 3 
	2 is small so go next step
	2nd 2 > 1
	1 is small that 3 and 1 so switch to arr[1] = 1
	3d 1 > 3
	1 is small than 3 so 1st place hold 1
	*/
	public void demo1() {
		int arr[] = {100 , 121, 131 ,1};
		int temp ;
		System.out.println("Array Before Sorting");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nArray after Manual_Assending_Order");
		
		for(int i = 0 ; arr.length > i ; i++) {//0
			for(int j = i+1; j < arr.length ; j++) {//1
				if(arr[i] > arr[j]) { 	
					temp = arr[i];		
					arr[i] = arr[j];	
					arr[j] = temp;		
				}
			}
		}
	}
}

class Auto_Assending_Order{
	public void demo() {
		int arr[]= {5,4,3,2,1};
		System.out.println("Array Before Sorting");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nArray after Auto_Assending_Order");
		Arrays.sort(arr);
		for(int i = 0 ; arr.length > i ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

class Manual_Dessending_Order{
	public void demo1() {
		int arr[] = {100 , 121, 131 ,1};
		int temp ;
		System.out.println("Array Before Sorting");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nArray after Manual_Dessending_Order");
		
		for(int i = 0 ; arr.length > i ; i++) {
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[i] < arr[j]) { 	
					temp = arr[i];		
					arr[i] = arr[j];	
					arr[j] = temp;		
				}
			}
		}
	}
}

