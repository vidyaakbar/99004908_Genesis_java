package java_project;

import java.util.*;

public class ShapeMain {
	public static void main(String[] args) {
		
		Circle circle;
		Square square;
		Scanner scan=new Scanner(System.in);
		String str;
		do {
			System.out.println("Circle\nSquare\nEnter the Shape");
			str=scan.nextLine();
			switch(str) {
				case "Circle":circle=new Circle();
				              System.out.println("Enter the radius: ");
				              circle.setV(scan.nextInt());
			                  circle.calculateArea(circle.getV());
			                  break;
				case "Square":square=new Square();
							  System.out.println("Enter the length: ");
							  square.setL(scan.nextInt());
							  square.calculateArea(square.getL());
							  break;
							  
			}
			scan.nextLine();
		}while(str.equals("Square")||str.equals("Circle"));

	}
}
