package edu.utoledo.cset.cset1200;

public class Circle extends SimpleGeometricObject {
	private double radius;

	public Circle() {
		// Default radius of 1
		this(1.0);
	}
	
	public Circle(double radius) {
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		// 5 radius so just 5 * radius
		return radius * 2*Math.PI;
	}
	
	public double getArea() {
		// Formula from wikipedia
		return (Math.PI*Math.pow(radius, 2));
	}
	
	public String toString() {
		return "Regular Circle: radius = " + radius;
	}
	
}

