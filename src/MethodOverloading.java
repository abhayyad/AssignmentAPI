
public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading Obj=new MethodOverloading();
		
		Obj.area(5.63f);
		Obj.area(5.63f,5.63f);	
		Obj.area(0.5f,5.63f,5.63f);

	}

	void area(float f, float g, float h) {
		System.out.println("Area of circle : " + (f * g * h));
	}

	void area(float f, float g) {
		
	System.out.println("Area of rectangle :" + (f * g));	 
		
	}

	void area(float f) {		
		System.out.println("Area of circle : " + (3.14 * f * f));	
	}

}

