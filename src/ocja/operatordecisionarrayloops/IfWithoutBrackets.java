package ocja.operatordecisionarrayloops;

public class IfWithoutBrackets {
	
	public static void main(String [] args) {
	
    int grade = 75;
    if(grade > 60)
        System.out.println("Congratulations"); 
  //  System.out.println("Congratulations222222222222");
   
     else
       System.out.println("You passed");
       System.out.println("You failed");     
    
    // note JVM is takes only first statement after if or else 
    // if there are 2 statements after if followed by else : compilation error

}
}
