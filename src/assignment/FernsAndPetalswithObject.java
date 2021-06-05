package assignment;

import java.util.Scanner;

public class FernsAndPetalswithObject {
	static int InventRoseCount = 100;
	static int InventSunflowerCount = 100;
	static int InventTulipCount = 100;
	static int RosePrice = 10;
	static int SunflowerPrice = 5;
	static int TulipPrice = 25;
	static int CustomerBill = 0;


	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		System.out.println("============Main Menu===========");
		System.out.println("1. Show Inventory");
		System.out.println("2. Purchase");
		System.out.println("3. Exit");		
		System.out.println("\n"+"Enter your choice");
		mainMenuActions();	
	}

	public static void mainMenuActions() {

		Scanner scan = new Scanner(System.in);

		int UserMainInput = scan.nextInt();
		while( UserMainInput < 1 || UserMainInput > 3 ){			
			System.out.println("Wrong menu selction, enter "
					+ "one of the menu option : ");
			UserMainInput = scan.nextInt();
		}	

		switch (UserMainInput) {
		case 1: 		
			inventory();
			mainMenu();
			break;
		case 2:	
			purchasing(scan);
			mainMenu();
			break;
		case 3:			
			billingAndExit();
			break;
		}

		scan.close();
	}

	private static void inventory() {
		System.out.println("========Inventory========");
		System.out.println("Rose: "+InventRoseCount+" units"+"\n"+
				"SunFlower: "+InventSunflowerCount+" units"+"\n"+"Tulip: "+InventTulipCount+" units");
	}

	private static void purchasing(Scanner scan) {
		int exitFlag = 0; 
		while (exitFlag == 0) {
			System.out.println("========Purchase========");
			System.out.println("1. Rose: "+"Rs."+RosePrice+"\n"+
					"2. SunFlower: "+"Rs."+SunflowerPrice+"\n"+"3. Tulip: "+"Rs."+
					TulipPrice+"\n"+"4. Go back to main menu ");
			System.out.println("\n"+"Enter your choice : ");
			int UserPurchaseInput = scan.nextInt();
			
			while( UserPurchaseInput < 1 || UserPurchaseInput > 4 ){			
				System.out.println("Wrong menu selction, enter "
						+ "one of the menu option : ");
				UserPurchaseInput = scan.nextInt();
			}
						
			if (UserPurchaseInput == 4 ) {
				exitFlag = 1;
				continue;
			}
			System.out.println("Enter the Quantity : ");
			int UserPurchaseQty = scan.nextInt();	
			UserPurchaseQty = purchaceQtyAndInventory(scan, UserPurchaseInput, UserPurchaseQty);
			CustomerBill = CustomerBill + (UserPurchaseQty * getItemPrice(UserPurchaseInput));
			updateInventory(UserPurchaseInput,UserPurchaseQty);
		}
	}

	private static int purchaceQtyAndInventory(Scanner scan, int UserPurchaseInput, int UserPurchaseQty) {
		if (checkInventory(UserPurchaseInput) < UserPurchaseQty){					
			System.out.println(" Sorry, we have only qty= "+
					checkInventory(UserPurchaseInput) +" available in inventory");
			System.out.println(" Do you want to go with available qty, Enter y or n ");
			String custAck = scan.next();

			if (custAck.charAt(0) == 'y')
			{
				UserPurchaseQty = checkInventory(UserPurchaseInput);
			}
			else if(custAck.charAt(0) == 'n')
			{
				UserPurchaseQty = 0;
			}
		}
		return UserPurchaseQty;
	}

	private static int checkInventory(int userPurchaseQty) {
		int count = 0;
		switch (userPurchaseQty) {
		case 1:count = InventRoseCount;break;
		case 2:count = InventSunflowerCount;break;
		case 3:count = InventTulipCount;break;
		}
		return count;
	}

	public static void updateInventory(int userPurchaseInput, int userPurchaseQty) {
		switch(userPurchaseInput) {		
		case 1: 
			
			Roses r = new Roses();
			
			InventRoseCount = r.buy(InventRoseCount,userPurchaseQty);			
			
			break;
			
		case 2: 
			
			SunFlower sf = new SunFlower();
						 
			InventSunflowerCount = sf.buy(InventSunflowerCount,userPurchaseQty); 
			break;
		case 3: 
			
			Tulips tp = new Tulips();
			InventTulipCount = tp.buy(InventTulipCount,userPurchaseQty);
			 
			break;
		}
	}

	public static int getItemPrice(int userPurchaseInput) {
		int price = 0;
		switch (userPurchaseInput) {
		case 1:price = RosePrice;break;
		case 2:price = SunflowerPrice;break;
		case 3:price = TulipPrice;break;
		}
		return price;
	}


	private static void billingAndExit() {
		System.out.println("You Bill is : Rs. "+CustomerBill+"\n"+
				"Thanks for visiting ferns and petals!!! ");
	}



}
