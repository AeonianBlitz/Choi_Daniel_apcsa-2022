//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number, x, y, z = 0;
   private int progress = 1;
   private String output = "";

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		for(x = progress; x < number; x++) {
			for(y = 1; y < number; y++) {
				for(z = 1; z < number; z++) {
					if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
						boolean caseOne = x % 2 == 1 && y % 2 == 0 && z % 2 == 1;
						boolean caseTwo = x % 2 == 0 && y % 2 == 1 && z % 2 == 1;
						if (caseOne || caseTwo) {
							return 1;
						}
					}
				}
			}
		}


		return 0;
	}

	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < number; i++) {
			if(greatestCommonFactor(1, 1, 1) == 1) {
				progress = x + 1;
				output = output + "\n" + x + " " + y + " " + z;
			}
		}
		return output + "\n";	
	}
}