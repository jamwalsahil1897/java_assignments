package sept9assign;

import java.util.Scanner;

public class NumberFormatExecption1 {
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer or String = " );
		String s = scanner.nextLine();
		
		try 
		{
		int i = Integer.parseInt(s);
		System.out.println("The square of the number is = " +i*i);
		System.out.println("Successfull!!!!!!!!!!! ");
	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Opps!!!!! Entered Input Is not a valid format for an integer "+e);
		}
	        main(arg);
	}    
       


}