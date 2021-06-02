package Assignment1;

//user -defined class
public class Participant { 

	//declare the variables
	String FirstName,LastName,Gender,ContactNo;
	int Age;
	
	// constructor with argument
	public Participant(String fn, String ln, int a, String g, String cn) { 
		this.FirstName = fn;
		this.LastName = ln;
		this.Age = a;
		this.Gender = g;
		this.ContactNo = cn;
	}
	
	//user-defined class
	//create setter and getter method
	public void setFirstName(String fn) {
		this.FirstName = fn;
	}
	public void setLastName(String ln) {
		this.LastName = ln;
	}
	public void setAge(int a) {
		this.Age = a;
	}
	public void setGender(String g) {
		this.Gender = g;
	}
	public void setContactNo(String cn) {
		this.ContactNo = cn;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getAge() {
		return Age;
	}
	public String getGender() {
		return Gender;
	}
	public String getContactNo() {
		return ContactNo;
	}
	
	//print participant summary
	public String toString() {
		return "Participant : "+FirstName+" "+LastName+"\nAge : "+Age+"\nGender : "+Gender+"\nContact Number : "+ContactNo;
	}
}
