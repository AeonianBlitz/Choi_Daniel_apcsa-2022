//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		//add test cases
		test.setNumber(496);										
		System.out.println(test.toString());
		test.setNumber(45);										
		System.out.println(test.toString());
		test.setNumber(6);										
		System.out.println(test.toString());
		test.setNumber(14);										
		System.out.println(test.toString());
		test.setNumber(8128);										
		System.out.println(test.toString());
		test.setNumber(1245);										
		System.out.println(test.toString());
		test.setNumber(33);										
		System.out.println(test.toString());
		test.setNumber(28);										
		System.out.println(test.toString());
		test.setNumber(27);										
		System.out.println(test.toString());
		test.setNumber(33550336);										
		System.out.println(test.toString());
	}
}