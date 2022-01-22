//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 1/21/22

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double Rise = y2 - y1;
		double Run = x2 - x1;
		double Slope = Rise / Run;
	    return Slope;
	}
}