import java.util.*;
class A1Q1 {
  public static void main(String[] args) {

    // create a string
    String f_name;
    String l_name;
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	f_name= sc.nextLine();    
	l_name= sc.nextLine();    

	String firstLetter = f_name.substring(0, 1);
    String remainingLetters = f_name.substring(1, f_name.length());
	remainingLetters = remainingLetters.toLowerCase();
    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();
	f_name = firstLetter + remainingLetters;
	l_name = l_name.toUpperCase();
    System.out.println(f_name);
	System.out.println(l_name);
  }
}
	
	