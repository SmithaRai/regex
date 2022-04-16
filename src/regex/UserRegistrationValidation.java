package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	
	
	  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
	  private static final String PASSWORD_RULE1 = "^[a-zA-Z0-9_-]{8,}$";
	  private static final String PASSWORD_RULE2 = "^[a-zA-Z0-9_-]{8,}(?=.*[A-Z])+$";
	  private static final String PASSWORD_RULE3 = "^[a-zA-Z0-9_-]{8,}[?=.*A-Z]+[?=.*0-9]+$";

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
      
      public boolean validatepassword_rule1 (String pwd_rule1){
          
          Pattern pattern = Pattern.compile(PASSWORD_RULE1);
          return pattern.matcher(pwd_rule1).matches();
 	      }
      
      public boolean validatepassword_rule2 (String pwd_rule2){
          
          Pattern pattern = Pattern.compile(PASSWORD_RULE2);
          return pattern.matcher(pwd_rule2).matches();
 	      }
      
      public boolean validatepassword_rule3 (String pwd_rule3){
    	    
    	    Pattern pattern = Pattern.compile(PASSWORD_RULE3);
    	    return pattern.matcher(pwd_rule3).matches();
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
		
		System.out.println("ENTER PASSWORD WITH MINIMUM EIGHT CHARACTERS : ");
		String pwd_rule1 = in.next();
		System.out.println(entry.validatepassword_rule1(pwd_rule1));
		
		System.out.println("ENTER PASSWORD WITH one UPPERCASE : ");
		String pwd_rule2 = in.next();
		System.out.println(entry.validatepassword_rule1(pwd_rule2));
		
		System.out.println("ENTER PASSWORD WITH ATLEAST ONE NUMERIC VALUE : ");
		String pwd_rule3 = in.next();
		System.out.println(entry.validatepassword_rule1(pwd_rule3));
	
	}

}
