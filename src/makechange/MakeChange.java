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
	
//		double result = 
		
		public static void price options() {
			
		while(itemPrice < 20.00) {
		if(itemPrice > customer) {
			System.out.println("Your remaining balance is " + amtOwed);
		}
		else if(itemPrice == customer) {
			System.out.println("Your remaining balance is $00.00. Have a great day!");
		}
		else if(itemPrice < customer) {
			change = change++;
			System.out.println("Your change is $" + change);
			break;
		
		}
		
		}

		double twentyDollar = change / 20.00;
		double tenDollar = change / 10.00;
		double fiveDollar = change / 5.00;
		double oneDollar = change / 1.00;
		double quarter = change / 00.25;
		double dime = change / 00.10;
		double nickel = change / 00.05;
		double penny = change / 00.01;
//		while(dollar <= change) {
//			System.out.println(dollar);
		}
		System.out.println((int) twentyDollar + " twenty dollar bills");
		System.out.println((int) tenDollar + " ten dollar bills");
		System.out.println((int) fiveDollar + " five dollar bills");
		System.out.println((int) oneDollar + " one dollar bills");
		System.out.println((int) quarter + " quarter");
		System.out.println((int) dime + " dime");
		System.out.println((int) nickel + " nickel");
		System.out.println((int) penny + " penny");

		if(twentyDollar == change) {
			System.out.println(twentyDollar);
		}
		
	}
	
}
