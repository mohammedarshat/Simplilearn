package Day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		while(true) {
		System.out.print("Enter the year : ");
		int year = scan.nextInt();
		System.out.println(new LeapYearCalclation().calculation(year));
//		}
		TerynaryOperator_LeapYearCalclation terynaryOperator_LeapYearCalclation = new TerynaryOperator_LeapYearCalclation();
		terynaryOperator_LeapYearCalclation.calculation(year);
	}

}

class LeapYearCalclation{
	public String calculation(int year) {
		if(year%4 == 0) {
			return year + " is leap year...";
		}else if(year%400 == 0){
			return year + " is leap year...";	
		}else {
			return year + " is not leap year...";	
		}
	}
}

class TerynaryOperator_LeapYearCalclation{
	public void calculation(int year) {
		String value1 = (year%4 == 0) || (year%400 == 0) ?  " is leap year..." :   " is not leap year...";
		System.out.println("\n Ternary operator \n");
		System.out.println(year + " " + value1);
}

}

