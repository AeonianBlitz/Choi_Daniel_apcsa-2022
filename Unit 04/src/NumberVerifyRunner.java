//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Daniel Choi
//Date - 1/25/21
//Class - APCSA
//Lab  - Number Verifier

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		System.out.println("1095 is odd :: " + NumberVerify.isOdd(1095));
		System.out.println("1095is even :: " + NumberVerify.isEven(1095));
		System.out.println("2 is odd :: " + NumberVerify.isOdd(2));
		System.out.println("2 is even :: " + NumberVerify.isEven(2));
		System.out.println("99 is odd :: " + NumberVerify.isOdd(99));
		System.out.println("99 is even :: " + NumberVerify.isEven(99));
		
	}
}