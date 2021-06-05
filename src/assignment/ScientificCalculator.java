package assignment;

public class ScientificCalculator extends Calculator {

	public double sin(double degreeAngle) {
		
		double radians = Math.toRadians(degreeAngle);
		return Math.sin(radians);

	}

	public double cos(double degreeAngle) {
		
		double radians = Math.toRadians(degreeAngle);
		return Math.cos(radians);

	}


}
