package assignment;

public class IntegerArraySorting {

	public static void main(String[] args) {
	
		
		int array [] = {3,1,0,-1,-1,0,0,1,1,0,-2,3,1,2,1,2,-2};
		
		for ( int i = 0 ; i < array.length; i++) {
			
		
			for (int j = 0; j < array.length-i-1 ;j++) {				
				int temp = 0;			
				if (array[j] > array[j+1]) {					
					temp = array [j+1];	
					array [j+1] = array[j];
					array[j] = temp; 					
				}	
				
			}	
			
		}
		
		
		for ( int value : array) {
			
			System.out.println(value + " ");
			
		}	

	}

}
