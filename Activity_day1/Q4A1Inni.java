package java_project;

public class Innings {
	
	   private String teamname;
	   private String inningsname;
	   private int runs;

	   public String getTeamname()
	   {
	      return teamname;
	   }
	   public String getInningsname()
	   {
	      return inningsname;
	   }
	   public int getRuns()
	   {
	       return runs;
	   }
	   public void setTeamname(String teamname)
	   {
	      this.teamname = teamname;
	   }
	   public void setInningsname( String inningsname)
	   {
	      this.inningsname = inningsname;
	   }
	   public void setRuns(int runs)
	   {
	       this.runs = runs;
	   }
	   public void displayInningsDetails() {
		   System.out.println("Name : " +this.getTeamname());
		   System.out.println("Scored : " +this.getRuns());
		   if(this.getInningsname().equals("First")) {
			   System.out.println("Need " + (this.getRuns()+1)+" to win ");
		   } else if (this.getInningsname().equals("Second")) {
			   System.out.println("Match Ended.");
		   }
		   
	   }

}