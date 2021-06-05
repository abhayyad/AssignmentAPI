package ocja.operatordecisionarrayloops;

public class ArrayDeclaration {

	public static void main(String[] args) {

		int array [] = new int[50]; // array declaration
	    int [] array1 = new int [100]; // array declaration
	    int array2[] = {10,20,30,40}; // array declaration + initialization
	    int array3 [] = new int[0];	    
	    char arr [] [] = new char[1][];
	    char [] arr1 [] = new char [1][];
	    
	    // char [] arr2 [] = new char [][6]; // not allowed - compilation 
	    
	    final boolean flag;
	    
	    flag = false;
	    
        while(flag) {
            System.out.println("Good Morning!");
        }		

	}

}
