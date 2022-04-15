package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	
	
	  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";

	  public boolean validateFirstName (String fname){
	         
          Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
          return pattern.matcher(fname).matches();
	  
              }

	  public boolean validatelastName (String lname){
	         
          Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
          return pattern.matcher(lname).matches();
	  
              }
	  
      public boolean validateEmailId (String emailid){
          
          Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
          return pattern.matcher(emailid).matches();
          }

      public boolean validatePhoneNumber (String pnumber){
          
          Pattern pattern = Pattern.compile(PHONE_NUMBER);
          return pattern.matcher(pnumber).matches();
          }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		UserRegistrationValidation entry = new UserRegistrationValidation();
		
		System.out.println("*********USER REGISTERATION VALIDATION**************");
		
		System.out.println("ENTER FIRST NAME : ");
		String fname = in.next();
		System.out.println(entry.validateFirstName(fname));
		
		System.out.println("ENTER LAST NAME : ");
		String lname = in.next();
		System.out.println(entry.validateFirstName(lname));
		
		System.out.println("ENTER EMAILID : ");
		String emailid = in.next();
		System.out.println(entry.validateFirstName(emailid));
		
		System.out.println("ENTER MOBILE NUMBER : ");
		String pnumber = in.next();
		System.out.println(entry.validatePhoneNumber(pnumber));
	}

}
