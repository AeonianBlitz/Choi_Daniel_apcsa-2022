//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", '0');
	}

	//add in second constructor
	public LetterRemover(String x, char y) {
		setRemover(x, y);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int i = 0;
		String cleaned = "";
		while(i < sentence.length()) {
			if(Character.compare(sentence.charAt(i), lookFor) != 0) {
				cleaned = cleaned + sentence.charAt(i);
				i++;
			} else {
				i++;
			}
			
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}