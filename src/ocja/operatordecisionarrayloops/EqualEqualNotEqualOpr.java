package ocja.operatordecisionarrayloops;

public class EqualEqualNotEqualOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 boolean flag1 = true;
	        boolean flag2 = false;
	        boolean flag3 = true;
	        boolean flag4 = false;
	        
	        System.out.println(!flag1 == flag2 != flag3 == !flag4); // in print Calculate from left to right
	        System.out.println(flag1 = flag2 != flag3 == !flag4); //in print Calculate from left to right
	        
	     // *************************************
	        
	        int score = 30; // Line n1
	        char grade = 'F'; // Line n2
	//        if (50 <= score < 60) // Line n3 compilation 
	            grade = 'D';
	 //       else if (60 <= score < 70) // Line n4 compilation
	            grade = 'C';
	  //      else if (70 <= score < 80) // Line n5 compilation
	            grade = 'B';
	  //      else if (score >= 80)
	            grade = 'A';
	        System.out.println(grade);
	        

	}

}
