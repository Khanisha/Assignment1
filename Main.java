package Assignment1;
 


public class Main {
			
	
	public static void main(String[] args) {

		System.out.println("---EDUCATION DAY CAMPS---");
		System.out.println(" ");
		EducationDayCamp edc = new EducationDayCamp("EDC UUM","DR Khalid Ibrahim","Prof Madya Senan, Prof Abi Binti Sulaiman, DR Khadir","07-8602100");
		edc.Description();
		System.out.println(" ");
		
		System.out.println("---EVENT DETAILS---");
		System.out.println(" ");
	    Event eve = new Event("Fitness Camp","John","Gunung Jerai, Kedah","Jungle Trekking & Hiking","2 Days 1 Night",200);
		System.out.println(eve.toString());
		System.out.println(" ");
		
		
		System.out.println("---TRAINER DETAILS---");
		System.out.println(" ");
		Trainer train = new Trainer("John","Mccarthy","Male","012-3456789","Malaysia Muscle Award Winner, Triple A Gym Owner",100,2);
		train.calcSalary();
		System.out.println(train.toString());
		System.out.println(" ");
		
		System.out.println("---PARTICIPANT DETAILS---");
		System.out.println(" ");
		Participant part = new Participant("Khanisha","Segar",23,"Female","011-10872917");
		System.out.println(part.toString());
		System.out.println(" ");		
		
		Finance cf = new Finance();
		System.out.println(cf.toString());
		System.out.println(" ");
		
		System.out.println("---BMI CALCULATOR---");
		System.out.println("Let us help you to calculate your BMI.");
		eve.calcBMI();
		System.out.println(" ");
		
		Marketing link = new Marketing("https://www.instagram.com/uumofficial/","https://www.facebook.com/search/top?q=school%20of%20computing%2C%20uum");
		System.out.println(" ");
		link.displayLink();

}
}
