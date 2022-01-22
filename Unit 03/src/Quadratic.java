//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		rootTwo = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	}

    public void print()
    {
    	System.out.print("\n\nrootone :: " + rootOne + "\nroottwo :: " + rootTwo + "\n\n\n");
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}