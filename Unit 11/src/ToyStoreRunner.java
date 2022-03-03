//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		ArrayList<String> list = new ArrayList<String>();
		list.add("sorry");
		list.add("bat");
		list.add("sorry");
		list.add("sorry");
		list.add("sorry");
		list.add("train");
		list.add("train");
		list.add("teddy");
		list.add("teddy");
		list.add("ball");
		list.add("ball");
		test.loadToys(list);
		System.out.print(test.toString());
	}
}