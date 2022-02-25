//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 2/24/22

import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(32673);
		
		ListDown test = new ListDown();
		System.out.println(test.go(list));
	}
}