//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare()
	{
		wordOne = "";
		wordTwo = "";
	}

	public WordsCompare(String one, String two)
	{
		wordOne = "";
		wordTwo = "";
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		int diff = wordOne.compareTo(wordTwo);
		if (diff < 0) {
			compare = -1;
		} else {
			compare = 1;
		}
	}


	public String toString()
	{
		if(compare < 0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}