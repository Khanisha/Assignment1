package Assignment1;
//pre-defined class
import java.util.Scanner;
import java.text.DecimalFormat;

//user-defined class
public class Finance {
Scanner s = new Scanner (System.in);
private static DecimalFormat df2 = new DecimalFormat("#.##");

//declare variables
double allowance, EventFee;
int days, NoOfParticipant, NoOfTrainers;

//constructor
public Finance() {
	System.out.println("Enter the details below : ");
	
	System.out.print("\n1. Total Number of the participants :");
	this.NoOfParticipant = s.nextInt();
	
	System.out.print("\n2. Total Number of Trainers For the event :");
	this.NoOfTrainers = s.nextInt();
	
	System.out.print("\n3. Fee of participant (each) : RM");
	this.EventFee = s.nextDouble();
	
	System.out.print("\n4. Allowance allocated for trainers (per day) :");
	this.allowance = s.nextDouble();
	
	System.out.print("\n5. Total No of days of the event :");
	this.days = s.nextInt();
	
}

//calculate Salary per trainer
public double calcSalary() {
	double Salary = this.allowance * this.days;
	return Salary;
}

//Total Expense of the event
public double totalExpense() {
	double Expense= calcSalary() * this.NoOfTrainers;
	return Expense;
}

//Total income of the event
public double totalIncome() {
	double Income = this.EventFee * this.NoOfParticipant;
	return Income;
}

//Net profit of the event
public double NetProfit() {
	double Profit = totalIncome() - totalExpense();
	return Profit;
}

//print the summary of Finance
public String toString() {
	return "\n------COMPANY FINANCE DETAILS------"
			+ "\nTotal Income : RM" + df2.format(totalIncome())
			+ "\nSalary per Trainer : RM" + df2.format(calcSalary())
			+ "\nTotal Expense : RM" + df2.format(totalExpense())
			+ "\nNet Profit : RM" + df2.format(NetProfit());
}
}
