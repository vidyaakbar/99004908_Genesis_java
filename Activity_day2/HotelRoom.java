package java_project;

import java.util.*;

public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom() {
		this.hotelName="";
		this.numberOfSqFeet=0;
		this.hasTV=false;
		this.hasWifi=false;
	}

	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi) {
		this.hotelName=hotelName;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
		
		
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	
	public int getRatePerSqFeet() {
		return 0;
	}
	
	public int calculateTariff() {
		return getRatePerSqFeet() * getNumberOfSqFeet();
		
	}
	

}

public class HotelRoom {

	public static void main(String[] args) {
		DeluxeRoom delux;
		DeluxeACRoom deluxac;
		SuiteACRoom suiteac;
		Scanner scan=new Scanner(System.in);
		
		
		int input;
		do {
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\n4. Exit\nSelect Room Type:");
		input=scan.nextInt();
		switch(input) {
		case 1:delux=new DeluxeRoom();
			   System.out.println("Hotel Name:");
			   scan.nextLine();
			   delux.setHotelName(scan.nextLine());
			   System.out.println("Room Square Feet Area:");
			   delux.setNumberOfSqFeet(scan.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   scan.nextLine();
			   String str=scan.nextLine();
			   if(str.equals("yes")) {
				   delux.setHasTV(true);
			   }
			   else {
				   delux.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String strr=scan.nextLine();
			   if(strr.equals("yes")) {
				   delux.setHasWifi(true);
			   }
			   else {
				   delux.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+delux.calculateTariff());
		       break;
		
		case 2: deluxac=new DeluxeACRoom();
			   System.out.println("Hotel Name:");
			   scan.nextLine();
			   deluxac.setHotelName(scan.nextLine());
			   System.out.println("Room Square Feet Area:");
			   deluxac.setNumberOfSqFeet(scan.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   scan.nextLine();
			   String a=scan.nextLine();
			   if(a.equals("yes")) {
				   deluxac.setHasTV(true);
			   }
			   else {
				   deluxac.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String b=scan.nextLine();
			   if(b.equals("yes")) {
				   deluxac.setHasWifi(true);
			   }
			   else {
				   deluxac.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+deluxac.calculateTariff());
		       break;
		case 3: suiteac=new SuiteACRoom();
			   System.out.println("Hotel Name:");
			   scan.nextLine();
			   suiteac.setHotelName(scan.nextLine());
			   System.out.println("Room Square Feet Area:");
			   suiteac.setNumberOfSqFeet(scan.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   scan.nextLine();
			   String c=scan.nextLine();
			   if(c.equals("yes")) {
				   suiteac.setHasTV(true);
			   }
			   else {
				   suiteac.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String d=scan.nextLine();
			   if(d.equals("yes")) {
				   suiteac.setHasWifi(true);
			   }
			   else {
				   suiteac.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+suiteac.calculateTariff());
		       break;
		case 4: System.out.println("Exit");
				break;
		  
		
		}
		
		}while(input!=4);
	}

}
