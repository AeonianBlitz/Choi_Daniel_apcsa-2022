//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 2/24/22

import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(11);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(12345);
		list.add(11);
		
		ListOddToEven test = new ListOddToEven();
		System.out.println(test.go(list));
	}
}