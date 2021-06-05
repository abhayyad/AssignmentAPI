package assignment;


public class StringOccurance {

	public static void main(String[] args) {

		String name = "abhayabhayabhuabhhababhayuiuiabhayabab";

		int stringLength = name.length(); 

	//	System.out.println(stringLength);
		
		int count = 0;

		for (int i = 0; i < stringLength - 1; i++) {

			String checkname = Character.toString(name.charAt(i)) + Character.toString(name.charAt(i + 1));

	//		System.out.println(checkname);
			
			if (checkname.equals("ab")) {
				
				count = count + 1;
			}

		}
		
		
		System.out.println("count of occurance of ab  " + count);
		
		

	}

}
