package java_project;

import java.util.*;

class Circle extends Shape {
	private int v;
	
	public int getV() {
		return v;
	}

	public void setV(int value) {
		v = value;
	}

	void calculateArea(int value) {
		System.out.println("Area of circle is: "+String.format("%.2f",3.14*v*v));
	}

}