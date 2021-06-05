package ocja.operatordecisionarrayloops;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' }, { 'G', 'H', 'I', 'K' },

		};

		System.out.println(arr.length);
		System.out.println(arr[3].length); // 4


		// PRINTING TWO DIMENTIONAL ARRAY using for loop

		System.out.println("************************");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("************************");
		
		for (char [] ch : arr) {
			
			for (char value : ch) {				
				System.out.print(value);			
			}		
			System.out.println();			
		}
		
		
		
		

	}

}
