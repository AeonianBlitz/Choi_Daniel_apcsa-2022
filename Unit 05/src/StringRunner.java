//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Enter a word :: ");
		String str = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven();
		test.setString(str);
		test.isEven();
		out.println(test.toString());
	}
}