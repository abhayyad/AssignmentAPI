package assignment;

public class Tulips extends Flower {
	
int buy(int inventTulipCount, int userPurchaseQty){
		
	inventTulipCount = inventTulipCount - userPurchaseQty;
	
		return 	inventTulipCount;
		
	}

}
