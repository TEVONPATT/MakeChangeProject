package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter in the item price: $");
//		double money = scan.nextDouble();
		double itemPrice = scan.nextDouble();
		
		System.out.print("Amount tendered by customer: $");
		double customer = scan.nextDouble();
	
		double amtOwed = itemPrice - customer;
		System.out.println("The remaining balance is " + amtOwed);
		
	}
}
