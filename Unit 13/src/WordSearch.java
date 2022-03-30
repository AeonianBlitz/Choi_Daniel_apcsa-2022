//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int len = 0;

    public WordSearch( int size, String str )
    {
    	m = new String [size] [size];
    	len = size;
    	int i = 0;
    	for (int r = 0; r < size; r++) {
    		for (int c = 0; c < size; c++) {
    		m[r][c] = str.substring(i, i+1);
    		i++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int r = 0; r < len; r++) {
    		for (int c = 0; c < len; c++) {
    			if (	checkRight(word, r, c) ||
    					checkLeft(word, r, c) ||
    					checkUp(word, r, c) ||
    					checkDown(word, r, c) ||
    					checkDiagUpRight(word, r, c) ||
    					checkDiagUpLeft(word, r, c) || 
    					checkDiagDownLeft(word, r, c) || 
    					checkDiagDownRight(word, r, c)			)
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String tmp = "";
		if (c + w.length() - 1 > len - 1) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r][c + i];
		}
		
		return w.equals(tmp);
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String tmp = "";
		if (c - w.length() + 1 < 0) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r][c - i];
		}
		
		return w.equals(tmp);
	}

	public boolean checkUp(String w, int r, int c)
	{
		String tmp = "";
		if (r - w.length() + 1 < 0) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r - i][c];
		}
		
		return w.equals(tmp);
	}

	public boolean checkDown(String w, int r, int c)
   {
		String tmp = "";
		if (r + w.length() - 1 > len - 1) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r + i][c];
		}
		
		return w.equals(tmp);
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String tmp = "";
		if (r - w.length() + 1 < 0 || c + w.length() - 1 > len - 1) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r - i][c + i];
		}
		
		return w.equals(tmp);
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String tmp = "";
		if (r - w.length() + 1 < 0 || c - w.length() + 1 < 0) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r - i][c - i];
		}
		
		return w.equals(tmp);
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String tmp = "";
		if (r + w.length() - 1 > len - 1 || c - w.length() + 1 < 0) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r + i][c - i];
		}
		
		return w.equals(tmp);
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String tmp = "";
		if (r + w.length() - 1 > len - 1 || c + w.length() - 1 > len - 1) {
			return false;
		}
		for (int i = 0; i < w.length(); i++) {
			tmp = tmp + m[r + i][c + i];
		}
		
		return w.equals(tmp);
	}

    public String toString()
    {
    	String res = "";
    	for (int r = 0; r < len; r++) {
    		for (int c = 0; c < len; c++) {
    			res = res + m[r][c] + " ";
    		}
    		res = res + "\n";
    	}
 		return res;
    }
}
