//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//add test cases 
		System.out.print("Enter value A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter value B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter value C ::  ");
		int c = keyboard.nextInt();

		Quadratic test = new Quadratic();
		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
		System.out.print("Enter value A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter value B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter value C ::  ");
		c = keyboard.nextInt();

		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
		System.out.print("Enter value A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter value B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter value C ::  ");
		c = keyboard.nextInt();

		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
	}
}