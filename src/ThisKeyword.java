
public class ThisKeyword {
	
	int id = 20;

	public static void main(String[] args) {				
		ThisKeyword s1 = new ThisKeyword();
		s1.m1();
	}

	
	void m1(){		
		int id = 12;		
		System.out.println(id);
		System.out.println(this.id);		
		
	}

}
