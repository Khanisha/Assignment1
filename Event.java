package Assignment1;

//pre-defined class
import java.util.Scanner;
import java.text.DecimalFormat;

//user-defined class
public class Event {
	private static DecimalFormat df2 = new DecimalFormat("##.##");
	
	//declare all variables
	String EventName, TrainerName, Location, MainActivity, Duration;
	  double Fee;
	  
	  //constructor with arguments
	  public Event(String en, String tn, String l, String ma, String d, double f) {
		  this.EventName = en;
		  this.TrainerName = tn;
		  this.Location = l;
		  this.MainActivity = ma;
		  this.Duration = d;
		  this.Fee = f;
	  }
	  
	  //user-defined class
	  //create setter and getter method
	  public void setEventName(String en) {
		  this.EventName = en;
	  }
	  public void setTrainerName(String tn) {
		  this.TrainerName = tn;
	  }
	  public void setLocation(String l) {
		  this.Location = l;
	  }
	  public void setMainActivity(String ma) {
		  this.MainActivity = ma;
	  }
	  public void setDuration(String d) {
		  this.Duration = d;
	  }
	  public void setFee(double f) {
		  this.Fee = f;
	  }
	  public String getEventName (String en) {
		  return EventName;
	  }
	  public String getTrainerName (String tn) {
		  return TrainerName;
	  }
	  public String getLocation (String l) {
		  return Location;
	  }
	  public String getMainActivity (String ma) {
		  return MainActivity;
	  }
	  public String getDuration (String d) {
		  return Duration;
	  }
	  public double getFee (double d) {
		  return Fee;
	  }
	  
	  //print the event summary
	  public String toString() {
		  return "Event Name : "+EventName+"\nTrainer Name : "+TrainerName+"\nLocation : "+Location+"\nMain Activity : "+MainActivity+"\nDuration : "+Duration+"\nFee : RM"+df2.format(Fee);
	  }
	  
	  //calculate the BMI of user
	  public void calcBMI() {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Input weight in kilogram: ");
	       double weight = sc.nextDouble();
	      System.out.print("\nInput height in meters: ");
	       double height = sc.nextDouble();
	       double BMI = weight / (height * height);
	      System.out.print("\nThe Body Mass Index (BMI) is "+ df2.format(BMI) + "kg/m2");  
	      sc.close();
	  }
}
