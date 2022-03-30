//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		count = number % 10;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int size = 0;
		int tmp = number;
		while (tmp != 0) {
			size++;
			tmp = tmp / 10;
		}
		
		int[] sorted = new int[size];
		for(int i = 0; i < sorted.length; i++) {
			sorted[i] = getNumDigits(number);
			number = number / 10;
		}
		
		Arrays.sort(sorted);
		return sorted;
	}
}