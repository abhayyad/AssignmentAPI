package oops.package1;

public abstract class Mobile {
	
private String model;
private String color;

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

public Mobile() {
	super();
	this.model = "Galaxy";
	this.color = "Blue";
}

public Mobile(String model, String color) {
	super();
	this.model = model;
	this.color = color;
}

public abstract void calling();
public abstract void SMSing();
public abstract void browsing();
	
}
