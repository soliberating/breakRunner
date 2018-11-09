/**
 * 
 */
package BreakRunner;

/**
 * @author IHABF
 *
 */
public class Person 
{
	private String name;
	private String job;
	private double start;
	private double shiftLength;
	
    // The constructor
	public Person (String name, String job, double start, double shiftLength)
	{
	      this.name=name;
	      this.shiftLength=shiftLength;
	      this.job=job;
	      this.start=start;
	 }
	
	//getters
	   public String getName()
	     {
	      return name;
	     }
	   public String getJob()
	     {
	      return job;
	     }
	   public double getShiftLength()
	    {
	      return shiftLength;
	    }
	   public double getStart()
	    {
	      return start;
	    }
        
	 //Setters
	   public void setName(String name)
	    {
		   this.name=name;
	    }
	   public void setJob(String job)
	    {
		   this.job=job;
	    }
	   public void setShiftLength(double shiftLength)
	    {
		   this.shiftLength=shiftLength;
	    }
	   public void setStart(double start)
	    {
		   this.start=start;
		}


}
