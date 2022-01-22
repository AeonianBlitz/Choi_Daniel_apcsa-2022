//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
		double BaseSum = base1 + base2;
		double HalfBaseSum = BaseSum / 2;
		double TrapArea = HalfBaseSum * height;
		return TrapArea;
	}
}