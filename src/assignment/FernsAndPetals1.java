package assignment;

import java.util.Scanner;

/*
1. Display main Menu
2. Select from Menu 1
3. Select option 1 , List displayed
4. Again display the main Menu
5. Select option 2 for purchase , list displayed
6. User entry requested
7. Enter the option for purchase
8. Qty. requested
9  enter the qty 
10 list displayed for purchase
11. Enter the option for purchase
12. Qty. requested
13. enter the qty.
14. list displayed for purchase. select go to main menu 
15 . Main menu displayed 
16 . Select Exit
17 . thank you Message with bill amount 

 **/

public class FernsAndPetals1 {

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

	public static void takeAction() {

		Scanner scan = new Scanner(System.in);

		int UserMainInput = scan.nextInt();

		while( UserMainInput < 1 || UserMainInput > 3 ){			
			System.out.println("Wrong menu selction, enter one of the menu option : ");
			UserMainInput = scan.nextInt();
		}	


		switch (UserMainInput) {

		case 1: 		
			System.out.println("========Inventory========");
			System.out.println("Rose: "+InventRoseCount+"\n"+
					"SunFlower: "+InventSunflowerCount+"\n"+"Tulip: "+InventTulipCount);
			mainMenu();
			break;

		case 2:	

			int exitFlag = 0; 
			while (exitFlag == 0) {
				System.out.println("========Purchase========");
				System.out.println("1. Rose: "+"Rs."+RosePrice+"\n"+
						"2. SunFlower: "+"Rs."+SunflowerPrice+"\n"+"3. Tulip: "+"Rs."+TulipPrice+"\n"+"4. Go back to main menu ");
				System.out.println("Enter your choice : ");
				int UserPurchaseInput = scan.nextInt();
				if (UserPurchaseInput == 4 ) {
					exitFlag = 1;
					continue;
				}
				System.out.println("Enter the Quantity : ");
				int UserPurchaseQty = scan.nextInt();	
				if (checkInventory(UserPurchaseInput) < UserPurchaseQty){					
					System.out.println(" Sorry, we have only qty= "+ checkInventory(UserPurchaseInput) +" available in inventory");
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
				
				CustomerBill = CustomerBill + (UserPurchaseQty * getItemPrice(UserPurchaseInput));
				updateInventory(UserPurchaseInput,UserPurchaseQty);
			}
			mainMenu();
			break;

		case 3:			
			System.out.println("You Bill is : Rs. "+CustomerBill+"\n"+"Thanks for visiting ferns and petals!!! ");
			break;
		}

		scan.close();
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
		case 1: InventRoseCount = InventRoseCount - userPurchaseQty; break;
		case 2: InventSunflowerCount = InventSunflowerCount - userPurchaseQty; break;
		case 3: InventTulipCount = InventTulipCount - userPurchaseQty; break;
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



	public static void mainMenu() {

		System.out.println("============Main Menu===========");
		System.out.println("1. Show Inventory");
		System.out.println("2. Purchase");
		System.out.println("3. Exit");		
		System.out.println("\n"+"Enter your chioce");
		takeAction();	
	}

}
