//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] result = new int[size];
		for (int i = 0 ; i < size; i++) {
			result[i] = (int) Math.floor(Math.random() * 10);
		}
		shiftEm(result);
		return result;
	}
	public static void shiftEm(int[] array)
	{
		int temp = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				temp = array[count];
				array[i] = temp;
				array[count] = 7;
				count++;
			}
		}
	}
}