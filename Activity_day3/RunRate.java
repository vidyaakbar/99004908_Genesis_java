import java.io.*;
import java.util.*;
public class RunRate
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int runs,overs;
		float runRate;
  
        try
		{
            System.out.println("Enter the total runs Scored: ");
			runs =Integer.parseInt(inp.readLine());
			
            System.out.println("Enter the total overs faced: ");
            overs=Integer.parseInt(inp.readLine());
			
			runRate=runs/overs;
            System.out.println("Run Rate: "+runRate);
        }
        catch(Exception e){
            System.out.println(e.getClass().getCanonicalName());
     
        }
   

}

}