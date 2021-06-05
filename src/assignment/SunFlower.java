package assignment;

public class SunFlower extends Flower {
	
int buy(int inventSunflowerCount, int userPurchaseQty){
	
	inventSunflowerCount = inventSunflowerCount - userPurchaseQty;
	
	return inventSunflowerCount;
					
		
	}

}
