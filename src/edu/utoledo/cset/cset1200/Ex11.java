package edu.utoledo.cset.cset1200;

import java.util.Scanner;

import edu.utoledo.cset.cset1200.Pentagon;
import edu.utoledo.cset.cset1200.Circle;

public class Ex11 {

	public static void main(String[] args) {
		mainMenu();

	}
	public static void mainMenu()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int menu=0;
		System.out.println("What Shape Would You Like To Work With?");
		System.out.println("1) Pentagon");
		System.out.println("2) Circle");
		menu = scan.nextInt();
		switch(menu)
		{
		case 1:
			pentMenu();
			break;
		case 2:
			circMenu();
			break;
		default:
			break;
		}
		
	}
	public static void pentMenu()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double side;
		String filled;
		String color;
		Pentagon pent = new Pentagon();
		
		System.out.print("Enter length of side: " );
		side = scan.nextDouble();
		// Need this to advance scanner to next input line
		scan.nextLine();
		System.out.print("Enter color: ");
		color = scan.nextLine();
		System.out.print("Filled? (true or false): ");
		filled = scan.nextLine();
		
		pent.setSide(side);
		pent.setFilled(filled);
		pent.setColor(color);
		
		System.out.println("Pentagon Details:");
		System.out.println("Color: " + pent.getColor());
		System.out.println("Filled: " + pent.isFilled());
		System.out.println("Area: " + pent.getArea());
		System.out.println("Perimeter: " + pent.getPerimeter());
	}
	public static void circMenu()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double radius;
		String filled;
		String color;
		Circle circ = new Circle();
		
		System.out.print("Enter length of radius: " );
		radius = scan.nextDouble();
		// Need this to advance scanner to next input line
		scan.nextLine();
		System.out.print("Enter color: ");
		color = scan.nextLine();
		System.out.print("Filled? (true or false): ");
		filled = scan.nextLine();
		
		circ.setRadius(radius);
		circ.setFilled(filled);
		circ.setColor(color);
		
		System.out.println("Circle Details:");
		System.out.println("Color: " + circ.getColor());
		System.out.println("Filled: " + circ.isFilled());
		System.out.println("Area: " + circ.getArea());
		System.out.println("Perimeter: " + circ.getPerimeter());
	}
}
