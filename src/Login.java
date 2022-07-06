import java.util.Scanner;
import java.util.regex.Pattern;

public class Login {
	private static final String PASSWORD_REGEX =
	        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
	 
	    private static final Pattern PASSWORD_PATTERN =
	                                Pattern.compile(PASSWORD_REGEX);
    
	public static void main(String[] args) {
		String fName="";
		String lName="";
		String emailId="";		
        String mobileNo="";
        String password="";
        //^[A-Za-z]{8,}+[A-Z]{1,}+[0-9]{1,}+[@_+-.]{1,0}
        //^[1-9][][0-9]*$
        //^[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter youe First Name");
        fName=sc.next();
        System.out.println("Enter your Last Name");
        lName=sc.next();
        System.out.println("Enter youe email");
        emailId=sc.next();
        System.out.println("Enter youe mobile No");
        mobileNo=sc.next();
        System.out.println("Enter youe password");
        password=sc.next();
        sc.close();
      //first name
        System.out.println(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2}$", fName));
        //last name
        System.out.println(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2}$", lName));
      //email validation
        System.out.println(Pattern.matches("[a-zA-Z0-9]{1,}[@]{1}[a-z]{5,}[.]{1}+[a-z]{3}", emailId));
      //phone no
        System.out.println(Pattern.matches("(0/91)?[1-9][0-9]{9}", mobileNo));
        
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("The Password " + password + " is valid");
        }
        else {
            System.out.print("The Password " + password + " isn't valid");
        }  
        
	}
    
}
