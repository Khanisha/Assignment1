package Assignment1;

//user-defined class
public class Marketing {
	
//declare all variables
 String Insta,FaceB;
 
 //constructor with arguments
 public Marketing(String IG, String fb) {
	this.Insta = IG;
	this.FaceB = fb;
 }
 
 //user-defined class
 //create setter and getter method
	public void setInsta(String IG) {
		  this.Insta = IG;
	  }
	public void setFaceB(String fb) {
		  this.FaceB = fb;
	  }
	public String getInsta(String IG) {
		  return Insta;
	  }
	public String getFaceB(String fb) {
		  return FaceB;
	  }
	
	//display the link for social media page
	public void displayLink() {
		System.out.println("For more info please visit our Instagram and Facebook like !");
		System.out.println(" ");
		System.out.println("Instagram : "+Insta);
		System.out.println("Facebook : "+FaceB);
	}
}
