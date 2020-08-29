package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter in the item price: $");
//		double money = scan.nextDouble();
		double itemPrice = scan.nextDouble();
		
		System.out.print("Amount tendered by customer: $");
		double customer = scan2.nextDouble();
	
		double amtOwed = itemPrice - customer;
		double change = customer - itemPrice;
//		System.out.println("The remaining balance is " + amtOwed);
	
		while(itemPrice < 20.00) {
		if(itemPrice > customer) {
			System.out.println("Your remaining balance is " + amtOwed);
		}
		else if(itemPrice == customer) {
			System.out.println("Your remaining balance is $00.00. Have a great day!");
		}
		else if(itemPrice < customer) {
			System.out.println("Your change is $" + change);
		}
		break;
		}
	}
	 double quarter = 00.25;
	 double dime = 00.10;
	 double nickel = 00.05;
	 double penny = 00.01;
	
}
