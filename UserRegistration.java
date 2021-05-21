package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Validation for user details
 * @author OM NAMO NAMAH
 * Here User Registration the main class
 */
public class UserRegistration 
{
	/**
	 * usernameValidation is the function of boolean type 
	 * check that the 1st letter must be in upper case
	 * check that minimum character will be in there
	 * @param name
	 * @return true or false value
	 */
	public static boolean usernameValidation(String name) 
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();	 
	}
	/**
	 * email is a function checks the email validity
	 * there are 3 mandatory  field abc , bridglabz , co
	 * two optional field   
	 */
	public static void email()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String email = sc.nextLine();
		String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
		System.out.println("The email is: " + email);
	    System.out.println("Check the email is correct? " + email.matches(regex));
	}
	/**
	 * in main method taking the input from the user to validate
	 * calling the function to perform.
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome in User Registration");
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the your First Name : ");
		String fname = sc.nextLine();	 
	    System.out.println(usernameValidation(fname));
	    System.out.print("Enter the your Last Name : ");
		String lname = sc.nextLine();	 
	    System.out.println(usernameValidation(lname));
	    
		email();
	}
}
