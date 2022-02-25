//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int i = 0;
		int memoryOdd = -1;
		int memoryEven = -1;
		
		while (memoryOdd == -1 && i < ray.size()) {
			if (ray.get(i) % 2 == 1) {
				memoryOdd = i;
			}
			i++;
		}
		
		while (i < ray.size()) {
			if (ray.get(i) % 2 == 0) {
				memoryEven = i;
			}
			i++;
		}
		
		if (memoryOdd == -1 || memoryEven == -1) {
			return -1;
		}
		
		return memoryEven - memoryOdd;
	}
}