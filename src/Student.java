public class Student {
	
	int id;
	String name;

	public Student() {
		
		id=999;
		name="DefaultName";			
		
	}
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;		
	}

	void show(){
		
	System.out.println(id);
	System.out.println(name);		
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"Abhay");
		Student s2 = new Student(102,"Soni");
		Student s3 = new Student();		
		s1.show();
		s2.show();
		s3.show();		
		System.out.println(s1.getId()+"   "+ s1.getName());
		System.out.println(s2.getId()+"   "+ s2.getName());
		System.out.println(s3.getId()+"   "+ s3.getName());
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
