package Assignment1;

//user-defined class
public class EducationDayCamp {
 
//declare all variables
String CompanyName, FounderName, CommitteeMembers, CustomerServiceNo;

//constructor with arguments
public EducationDayCamp(String CN, String FN, String CM, String CSN) {
	this.CompanyName = CN;
	this.FounderName = FN;
	this.CommitteeMembers = CM;
	this.CustomerServiceNo = CSN;
}

//user-defined class
//create setter and getter method
public void setCompanyName(String CN) {
	this.CompanyName = CN;
}
public void setFounderName(String FN) {
	this.FounderName = FN;
}
public void setCommitteeMembers(String CM) {
	this.CommitteeMembers = CM;
}
public void setCustomerServiceNo(String CSN) {
	this.CustomerServiceNo = CSN;
}
public String getCompanyName(String CN) {
	  return CompanyName;
}
public String getFounderName(String FN) {
	  return FounderName;
}
public String getCommitteeMembers(String CM) {
	  return CommitteeMembers ;
}
public String getCustomerServiceNo(String CSN) {
	  return CustomerServiceNo;
}

//print the education camp day summary
public void Description() {
	System.out.println("Sometimes known as summer camps or holiday camps, "
			+ "\nthese camps offer day-long activities during the weekends "
			+ "\nor for a few days during the summers or during holidays. "
			+ "\nIt is related to games and studies. It is based more on learning through teamwork, co-ordination, and co-operation.");
	System.out.println(" ");
	System.out.println("Company Name :  " + CompanyName);
	System.out.println("Founder Name : " + FounderName);
	System.out.println("Committee Members : " + CommitteeMembers);
	System.out.println("Customer Service Number : " + CustomerServiceNo);
	
}
}
