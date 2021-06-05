
class Flower {
	
	/*
	 * Flower(){ System.out.println(" Flower is blooming"); }
	 */

	Flower(int i) {
		System.out.println(" Flowers are blooming :" + i);	
	}
	
	
}

public class Rose extends Flower {
	
	
	Rose(){
		
	    super(10);		
		System.out.println(" Rose is blooming");
		
	}

	public static void main(String[] args) {
		
		Rose r = new Rose();

	}

}
