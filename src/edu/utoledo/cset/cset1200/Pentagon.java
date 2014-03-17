package edu.utoledo.cset.cset1200;

public class Pentagon extends SimpleGeometricObject {
	private double side;

	public Pentagon() {
		// Default sides of 1
		this(1.0);
	}
	
	public Pentagon(double side) {
		this.setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getPerimeter() {
		// 5 sides so just 5 * side
		return side * 5;
	}
	
	public double getArea() {
		// Formula from wikipedia
		return (5 * Math.pow(side,2) * Math.tan(Math.toRadians(54)))/4.0;
	}
	
	public String toString() {
		return "Regular Pentagon: side = " + side;
	}
	
}
