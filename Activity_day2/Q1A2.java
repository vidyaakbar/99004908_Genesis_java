package java_project;
import java.util.*;

public class Vehicle {
   protected String make;
   protected String vehicleNumber;
   protected String fuelType;
   protected int fuelCapacity;
   protected int cc;
   
   public Vehicle() {
	   this.make="";
	   this.vehicleNumber="";
	   this.fuelType="";
	   this.fuelCapacity=0;
	   this.cc=0;
	   
   }
   
   public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc) {
	   this.make=make;
	   this.vehicleNumber=vehicleNumber;
	   this.fuelType=fuelType;
	   this.fuelCapacity=fuelCapacity;
	   this.cc=cc;
	   
   }
   
   public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getVehicleNumber() {
	return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}

public String getFuelType() {
	return fuelType;
}

public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public int getFuelCapacity() {
	return fuelCapacity;
}

public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}

public int getCc() {
	return cc;
}

public void setCc(int cc) {
	this.cc = cc;
}

public void displayMake() {
	   System.out.println("Make of the vehicle"+make);
   }
   
   public void displayBasicInfo() {
	   System.out.println("---Basic Information---");
	   System.out.println("Vehicle Number:"+vehicleNumber);
	   System.out.println("Fuel Capacity:"+fuelCapacity);
	   System.out.println("Fuel Type:"+fuelType);
	   System.out.println("CC:"+cc);
	   
   }
   
   public void displayDetailInfo() {
	   
   }
	
}


public class Main_Vehicles {

	public static void main(String[] args) {
	    TwoWheeler two_w;
	    FourWheeler four_w;
		Scanner scan=new Scanner(System.in);
		int input;
		do {
			System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
			input=scan.nextInt();
			switch(input) {
			case 1:four_w=new FourWheeler();
				   System.out.println("Vehicle Make:");
				   scan.nextLine();
				   four_w.setMake(scan.nextLine());
				   System.out.println("Vehicle  Number:");
				   four_w.setVehicleNumber(scan.nextLine());
				   System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				   int choice=scan.nextInt();
				   if(choice==1) {
					   four_w.setFuelType("Petrol");
				   }
				   else {
					   four_w.setFuelType("Diesel");
				   }
				   System.out.println("Fuel Capacity:");
				   four_w.setFuelCapacity(scan.nextInt());
				   System.out.println("Engine CC:");
				   four_w.setCc(scan.nextInt());
				   System.out.println("Audio System:");
				   scan.nextLine();
				   four_w.setAudioSystem(scan.nextLine());
				   System.out.println("Number of Doors");
				   four_w.setNumOfDoors(scan.nextInt());
				   System.out.println("***"+four_w.getMake()+"***");
				   four_w.displayBasicInfo();
				   four_w.displayDetailInfo();
				   
				   
			      
				  break;
			case 2:two_w=new TwoWheeler();
			       System.out.println("Vehicle Make:");
			       scan.nextLine();
			       two_w.setMake(scan.nextLine());
			       System.out.println("Vehicle  Number:");
			       two_w.setVehicleNumber(scan.nextLine());
			       System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			       int ch=scan.nextInt();
			       if(ch==1) {
			    	   two_w.setFuelType("Petrol");
			       }
			       else {
			    	   two_w.setFuelType("Diesel");
			       }
			      System.out.println("Fuel Capacity:");
			      two_w.setFuelCapacity(scan.nextInt());
			      System.out.println("Engine CC:");
			      two_w.setCc(scan.nextInt());
			      System.out.println("kickStartAvailable(yes/no):");
			      scan.nextLine();
			      String y=scan.nextLine();
			      if(y.equals("yes")) {
			    	  two_w.setKickStartAvailable(true);
			      }
			      else {
			    	  two_w.setKickStartAvailable(false);
			      }
			      System.out.println("***"+ two_w.getMake()+"***");
			      two_w.displayBasicInfo();
			      two_w.displayDetailInfo();

				  break;
				  
			
			 
			}
			
			
		}while(input==1||input==2);

	}

}
