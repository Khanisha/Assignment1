package Assignment1;

//pre-defined class
import java.text.DecimalFormat;

//user-defined class
public class Trainer {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare the variables
	String FirstName,LastName,Gender,ContactNo, Qualification;
	double Allowance;
	int Days;

	//constructor with arguments
public Trainer(String fname, String lname, String gen, String cno, String quali, double allown, int day) {
	this.FirstName = fname;
	this.LastName = lname;
	this.Gender = gen;
	this.ContactNo = cno;
	this.Qualification = quali;
	this.Allowance = allown;
	this.Days = day;
}	

//user-defined class
//create setter and getter method
public void setFirstName(String fname) {
	  this.FirstName = fname;
}
public void setLastName(String lname) {
	  this.LastName = lname;
}
public void setGender(String gen) {
	  this.Gender = gen;
}
public void setContactNo(String cno) {
	  this.ContactNo = cno;
}
public void setQualification(String quali) {
	  this.Qualification = quali;
}
public void setAllowance(double allown) {
	  this.Allowance = allown;
}
public void setDays(int day) {
	  this.Days = day;
}
public String getFirstName(String fname) {
	  return FirstName;
}
public String getLastName(String lname) {
	  return LastName;
}
public String getGender(String gen) {
	  return Gender;
}
public String getContactNo(String cno) {
	  return ContactNo;
}
public String getQualification(String quali) {
	  return Qualification;
}
public double getAllowance(String allown) {
	  return Allowance;
}
public int getDays(String day) {
	  return Days;
}

//calculate the salary of each trainer
public double calcSalary() {
	double Salary = this.Allowance * this.Days;
	return Salary;
}

//print trainer summary
public String toString() {
	return "Trainer : "+FirstName+" "+LastName+ "\nGender : "+Gender+"\nContact Number : "+ContactNo+"\nQualification : "+Qualification+"\nSalary : RM"+df2.format(calcSalary());
}
}
