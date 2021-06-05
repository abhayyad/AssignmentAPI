
public class AccountTest {

	public static void main(String[] args) {
		
		CurrentAccount c1 = new CurrentAccount();
		SavingAccount s1 = new SavingAccount();
		
		
		System.out.println("\n"+"Input Current account details");
		
		c1.input();
		c1.inputCurrentDetails();
		
		System.out.println("\n"+"Input Saving account details");
		s1.input();
		s1.inputSavingDetails();
		
		System.out.println("\n"+"Displaying Current account details");
		c1.show();
		c1.showCurrentDetails();
		
		System.out.println("\n"+"Displaying Saving account details");
		s1.show();
		s1.showSavingDetails();	
		

	}

}
