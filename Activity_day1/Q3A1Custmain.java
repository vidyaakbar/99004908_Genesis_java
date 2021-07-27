package java_project;

import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details:");
		String[] arrofStr=scan.nextLine().split(",");
		c.setName(arrofStr[0]);
		c.setAddress(arrofStr[1]);
		c.setMobile(arrofStr[2]);
		
		System.out.println("Name: "+c.getName());
		System.out.println("Address: "+c.getAddress());
		System.out.println("Mobile: "+c.getMobile());

	}

}