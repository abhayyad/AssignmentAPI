
public class CurrentAccount extends Account {
	
	float transactionFee;	

	void inputCurrentDetails() {
		System.out.println(" Enter transaction fee  ");
		transactionFee = scan.nextFloat();	
		
	}

	void showCurrentDetails() {		
		System.out.println(" Transaction fee is  : " + transactionFee );
		
	}
	
	

}
