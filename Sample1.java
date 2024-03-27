package Project;

import java.util.Scanner;
	public class Sample1 {
		public double subTotal;
			public static double runningTotal;
			private static double itemPrice;
			static boolean ordering = true;
			static Scanner input = new Scanner(System.in);
			static double j=0.0;
			public static void main(String[] args) {
			int menuOption;
			int foodItem = 0;
			input = new Scanner(System.in);
			double runningTotal=0;
			while(ordering) 
			{
			menu();
			menuOption = input.nextInt();
			switch(menuOption){
			case 1:
			foodItem = 1;
			runningTotal += ItemPrice(foodItem);
			break;
			case 2:
			foodItem = 2;
			runningTotal += ItemPrice(foodItem);
			break;
			case 3:
			foodItem = 3;
			runningTotal += ItemPrice(foodItem);
			break;
			case 4:
			done(runningTotal);
			break;
			default:
			System.out.println("Invalid option.");
			}
			} 
			System.out.println("Total amount: " + runningTotal);
			}
			public static void menu() {
			System.out.println("WELCOME TO FOOD COURT \n1. Burger (40) \n2. Fries (50)\n3. Soda (30) \n4. TO EXIT");
			}
			
			public static double ItemPrice(int foodItem) {
			if (foodItem == 1) {
			    System.out.println("You've ordered a burger");
			    itemPrice = 40;
			}
			if (foodItem == 2) {
			    System.out.println("You've ordered fries");
			    itemPrice = 50;
			}
			if (foodItem == 3) {
			    System.out.println("You've ordered a soda");
			    itemPrice = 30;
			}
			quantity();
			return j;
			}
			
			public static double quantity() {
			System.out.println("Enter quantity");
			double quantity = input.nextDouble();
			subTotal(quantity, itemPrice);
			return quantity;
			}
			
			public static double subTotal(double quantity, double itemPrice) {
			double subTotal = quantity * itemPrice;
			//System.out.println("Subtotal: " + subTotal);
			j=subTotal;
			return subTotal;
			}
			
			public static void done(double runningTotal) {
			ordering = false;
			System.out.println("Enjoy your meal");
			}
			}