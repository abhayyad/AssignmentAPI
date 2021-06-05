package assignment;

public class Roses extends Flower {
	
	public int buy(int inventRoseCount, int userPurchaseQty){
		
		inventRoseCount = inventRoseCount - userPurchaseQty;
		
		return inventRoseCount;			
		
	}

	
}
