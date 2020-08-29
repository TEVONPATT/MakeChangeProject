package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		int twentyDollar = 0;
		int tenDollar = 0;
		int fiveDollar = 0;
		int oneDollar = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter in the item price: $");
		double itemPrice = scan.nextDouble();
		
		System.out.print("Amount tendered by customer: $");
		double amtpaid = scan.nextDouble();
		
		double change = amtpaid - itemPrice;
		
		if(amtpaid < itemPrice) {
			System.out.println("Insufficient funds!");
		}
		else if(amtpaid == itemPrice) {
			System.out.println("Balance remaining is $00.00");
		}
		else {
			while(change >= 20) {
				twentyDollar++;
				change -= 20;
			}
			while(change >= 10) {
				tenDollar++;
				change -= 10;
			}
			while(change >= 5) {
				fiveDollar++;
				change -= 5;
			}
			while(change >= 1) {
				oneDollar++;
				change -= 1;
			}
			while(change >= .25) {
				quarter++;
				change -= .25;
			}
			while(change >= .10) {
				dime++;
				change -= .10;
			}
			while(change >= .05) {
				nickel++;
				change -= .05;
			}
			while(change >= .01) {
				penny++;
				change -= .01;
			}
			System.out.printf("Your change is $" + change);
			System.out.println();
			System.out.println(twentyDollar + " twenty dollar bills");
			System.out.println(tenDollar + " ten dollar bills");
			System.out.println(fiveDollar + " five dollar bills");
			System.out.println(oneDollar + " one dollar bills");
			System.out.println(quarter + " quarters");
			System.out.println(dime + " dimes");
			System.out.println(nickel + " nickels");
			System.out.printf(penny + " pennies");
//			if(change == .01) {
//				System.out.println(penny + " penny");
//			}
//			else {
//				System.out.printf(penny + " pennies");
//			}
		}
//		double amtOwed = itemPrice - customer;
//		double change = customer - itemPrice;
//		if(customer > itemPrice) {
//		System.out.println("The remaining balance is " + amtOwed);
	
//		double result = 
		
		
//	}
//	public static void priceOptions() {
		
		
		
//		
//		double twentyDollar = change / 20.00;
//		double tenDollar = change / 10.00;
//		double fiveDollar = change / 5.00;
//		double oneDollar = change / 1.00;
//		double quarter = change / 00.25;
//		double dime = change / 00.10;
//		double nickel = change / 00.05;
//		double penny = change / 00.01;
////		while(dollar <= change) {
////			System.out.println(dollar);
////		}
//		
//		while(itemPrice < 20.00) {
//			if(itemPrice > customer) {
//				System.out.println("Your remaining balance is " + amtOwed);
//			}
//			else if(itemPrice == customer) {
//				System.out.println("Your remaining balance is $00.00. Have a great day!");
//			}
//			else if(itemPrice < customer) {
//				change = change++;
////				System.out.println();
//				System.out.println("Your change is: ");
//				if(twentyDollar >= change) {
//					System.out.println("Your change is twentyDollar" + twentyDollar);
//				}
//				else if(tenDollar >= change) {
//					System.out.println("Your change is tenDollar" + tenDollar);
//					
//				}
//				break;
//			}
//			
//			
//		}
//		System.out.println((int) twentyDollar + " twenty dollar bills");
//		System.out.println((int) tenDollar + " ten dollar bills");
//		System.out.println((int) fiveDollar + " five dollar bills");
//		System.out.println((int) oneDollar + " one dollar bills");
//		System.out.println((int) quarter + " quarter");
//		System.out.println((int) dime + " dime");
//		System.out.println((int) nickel + " nickel");
//		System.out.println((int) penny + " penny");
//		
		}
		
	}


