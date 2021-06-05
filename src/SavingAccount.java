import java.util.Scanner;

class Account {
	
	String id;
	double balance;
	
	Scanner scan = new Scanner(System.in);
	
	void input() {
		System.out.println(" enter the id and balance");
		id=scan.next();
		balance=scan.nextDouble();
	}
	
	void show() {
		System.out.println(" User Id : "+ id);
		System.out.println(" Account Balance : " +  balance);
	}
	}

public class SavingAccount extends Account{	
	
	float rateOfInterest;
	
	void inputSavingDetails() {
	System.out.println(" enter ROI ");
	rateOfInterest = scan.nextFloat();		
	}
	
	void showSavingDetails() {
	System.out.println(" ROI is : "+ rateOfInterest);
		
	}

	
	  public static void main(String[] args) {
	  
	  SavingAccount s1 = new SavingAccount(); s1.input(); s1.inputSavingDetails();
	  s1.show(); s1.showSavingDetails();
	  
	  
	  }
	 

}
