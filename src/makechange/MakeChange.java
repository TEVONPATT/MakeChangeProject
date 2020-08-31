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
			
			System.out.println("Your change is $" + change);
			System.out.println();
			System.out.println(twentyDollar + " twenty dollar bills");
			System.out.println(tenDollar + " ten dollar bills");
			System.out.println(fiveDollar + " five dollar bills");
			System.out.println(oneDollar + " one dollar bills");
			System.out.println(quarter + " quarters");
			System.out.println(dime + " dimes");
			System.out.println(nickel + " nickels");
			System.out.println(penny + " pennies");
		}
		}
		
	}


