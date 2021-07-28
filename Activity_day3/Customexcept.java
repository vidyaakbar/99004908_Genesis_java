
import java.util.*;
import java.util.Scanner;
 class CustomException extends Exception{  
 CustomException(String s){  
  super(s);  
 }  
}  
 class Customexcept{  
  
    static void validate()throws CustomException{ 
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
       System.out.print("Enter Player name ");  
        String str= sc.nextLine();  

      System.out.print("Enter age ");  
       int n= sc.nextInt();       

     if(n<19)
     { 
      throw new CustomException("InvalidAgeRangeException");  
    }
     else 
     { 
       System.out.print("Player name: "+ str + "\n");  
       System.out.print("Player Age: "+ n + "\n");   
     }
   }  
     
   public static void main(String args[]){  
      try{  
        
         validate();  
      }
      catch(Exception m)
      {
        System.out.println("Exception occured: "+m);
      }  
     }
     
  }  