package java_project;

import java.util.*;

class Square extends Shape {
	private int l;
	
	public int getL() {
		return l;
	}

	public void setL(int value) {
		l = value;
	}

	void calculateArea(int value) {
		float area=value*value;
		System.out.println("Area of square is:"+String.format("%.2f",area));
	}

}