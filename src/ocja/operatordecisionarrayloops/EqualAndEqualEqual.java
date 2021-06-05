package ocja.operatordecisionarrayloops;

public class EqualAndEqualEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 boolean flag = false;
	        do {
	            if(flag = !flag) { //Line n1-----------------------------
	                System.out.print(1); //Line n2
	                continue; //Line n3
	            }
	            System.out.println(2); //Line n4
	        } while(flag); //Line n5
	        
	  ////////////////////////////////////////////////////      
	        
	        flag = false;
	        do {
	            if(flag == !flag) { //Line n1-----------------------
	                System.out.print(1); //Line n2
	                continue; //Line n3
	            }
	            System.out.println(2); //Line n4
	        } while(flag); //Line n5

	}

}
