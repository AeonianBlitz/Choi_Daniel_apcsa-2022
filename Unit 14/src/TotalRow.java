//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int sum = 0;
    	List<Integer> result = new ArrayList<Integer>();
    	for (int [] row : m) {
    		for (int num : row) {
    			sum = sum + num;
    		}
    		result.add(sum);
    		sum = 0;
    	}
		return result;
    }
}
