//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 2/6/22

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int i = 0;
		int memoryOdd = -1;
		int memoryEven = -1;
		
		while (memoryOdd == -1 && i < ray.length) {
			if (ray[i] % 2 == 1) {
				memoryOdd = i;
			}
			i++;
		}
		
		while (memoryEven == -1 && i < ray.length) {
			if (ray[i] % 2 == 0) {
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