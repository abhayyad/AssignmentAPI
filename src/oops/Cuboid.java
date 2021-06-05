package oops;

public class Cuboid extends Rectangle {
	
	private int height;	
	

	public Cuboid(int length, int breath, int height) {
		super(length, breath);
		this.height = height;
	}
	
	public Cuboid() {
		super();
		this.height = 50;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getVolume(){
		return super.getArea()*this.height;
	}
	

}
