package Phase1_Assigment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.print("Enter the num1 value : ");
			int num1 = scan.nextInt();
			System.out.print("Enter the num2 value : ");
			int num2 = scan.nextInt();
			System.out.print("Enter the Operator : ");
			String op = scan.next();

			Calculator.calculator(num1, num2, op);
		}
	}

	public static void calculator(double num1, double num2, String op) {
		double ans = 0;
		switch (op) {
		case "+":
			ans = num1 + num2;
			break;
		case "-":
			ans = num1 - num2;
			break;
		case "*":
			ans = num1 * num2;
			break;
		case "/":
			ans = num1 / num2;
			break;
		}
		System.out.print("Results: ");
		System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}
}