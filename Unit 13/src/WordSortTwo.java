//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		String temp = "";
		for (int i = 0; i < wordRay.length; i++) {
            for (int j = i + 1; j < wordRay.length; j++) {
                if (wordRay[i].compareTo(wordRay[j]) > 0) {
                    temp = wordRay[i];
                    wordRay[i] = wordRay[j];
                    wordRay[j] = temp;
                }
            }
        }
	}

	public String toString()
	{
		String output="";
		sort();
		for(String s : wordRay) {
			output = output + s + "\n";
		}
		
		return output+"\n\n";
	}
}