//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println(RecursionFunOne.countEvenDigits(4532));

		//add more test cases
		System.out.println(RecursionFunOne.countEvenDigits(11145322));
		System.out.println(RecursionFunOne.countEvenDigits(224532714));
		System.out.println(RecursionFunOne.countEvenDigits(2468));
		System.out.println(RecursionFunOne.countEvenDigits(13579));
		
		System.out.print("\n\n\n");
		
		System.out.println(RecursionFunThree.luckyThrees(3));
		System.out.println(RecursionFunThree.luckyThrees(31332));
		System.out.println(RecursionFunThree.luckyThrees(134523));
		System.out.println(RecursionFunThree.luckyThrees(3113));
		System.out.println(RecursionFunThree.luckyThrees(13331));
		System.out.println(RecursionFunThree.luckyThrees(777337777));
	}
}