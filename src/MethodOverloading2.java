
public class MethodOverloading2 {

	public static void main(String[] args) {

		MethodOverloading2 Obj = new MethodOverloading2();

		Obj.sum(5.63f, 5.63f);
		Obj.sum(10, 10);
		Obj.sum(10, 10.04f);

	}

	void sum(float f, float g) {

		System.out.println("Sum of float :" + (f + g));

	}

	
	  void sum(int f, int g) {
	  
	  System.out.println("sum of int :" + (f + g));
	  
	  }
	 

}
