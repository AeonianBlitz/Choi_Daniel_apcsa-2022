//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('0');
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		int amountTwo = amount;
		char letterTwo = letter;
		int limit = amount;
		
		for(int h = 0 ; h < amount; h++) {
			for(int i = 0; i < limit; i++) {
				for(int j = 0; j < amountTwo; j++) {
					output = output + letterTwo;
				}
				output = output + " ";
				amountTwo--;
				
				int next = (int) letterTwo + 1;
				
				if (next == 91) {
					next = 65;
				}
				
				letterTwo = (char) next;
			}
			amountTwo = amount;
			letterTwo = letter;
			output = output + "\n";
			limit--;
		}
		
		return output;
	}
}