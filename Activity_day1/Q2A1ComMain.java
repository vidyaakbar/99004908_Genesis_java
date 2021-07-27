package java_project;

import java.util.*;

public class CompanyMain {

	public static void main(String[] args) {
		
		Company company=new Company();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the company name: ");
		company.setName(scan.nextLine());
		System.out.println("Enter the employees: ");
		company.setEmployees(scan.nextLine());
		System.out.println("Enter TeamLead");
		company.setTeamlead(scan.nextLine());
		
		
		String[]c=company.getEmployees().split(",");
		int flag=0;
		for(String x:c) {
			if(x.equals(company.getTeamlead())) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("Invalid input.");
		}
		else {
			System.out.println("Name: "+company.getName());
			System.out.println("Employees: "+company.getEmployees());
			System.out.println("Lead: "+company.getTeamlead());
		}
		
		
	}

}