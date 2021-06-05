
public class SilverSavingAccount extends SavingAccount {
	
	String offerId;	

	void inputSilverDetails() {
		System.out.println(" Enter Offer Id  ");
		offerId = scan.next();	
		
	}

	void showSilverDetails() {		
		System.out.println(" Silver Offer id  : " + offerId );
		
	}
	
		


	public static void main(String[] args) {
		
		SilverSavingAccount s1 = new SilverSavingAccount();
		
		s1.input();
		s1.inputSavingDetails();
		s1.inputSilverDetails();
		s1.show();
		s1.showSavingDetails();
		s1.showSilverDetails();

	}

}
