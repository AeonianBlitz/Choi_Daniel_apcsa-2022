//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] tmp = {"a", "b", "c", "d"};
		Grid test = new Grid(10, 10, tmp);
		System.out.println(test.toString());
	}
}