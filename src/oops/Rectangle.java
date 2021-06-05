package oops;

public class Rectangle {

	private int length;
	private int breath;

	private int shapeId;

	static int countOfShape;

	public Rectangle(int length, int breath) {
		this.length = length;
		this.breath = breath;
		++countOfShape;
		this.shapeId = countOfShape;		
	}

	public Rectangle() {
		this.length = 1;
		this.breath = 1;
		++countOfShape;
		this.shapeId = countOfShape;
	}

	
	public int getShapeId() {
		return shapeId;
	}

	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public int getArea() {
		return this.length * this.breath;
	}

}
