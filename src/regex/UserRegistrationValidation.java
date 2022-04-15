package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	
	
	  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,}$";
	  
	  public boolean validateFirstName (String fname){
	         
          Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
          return pattern.matcher(fname).matches();
	  
              }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		UserRegistrationValidation entry = new UserRegistrationValidation();
		
		System.out.println("*********USER REGISTERATION VALIDATION**************");
		
		System.out.println("ENTER FIRST NAME : ");
		String fname = in.next();
		System.out.println(entry.validateFirstName(fname));
		
	}

}
