//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 2/6/22

public class RaySumLast
{
	public static int go(int[] ray)
	{
		if (ray.length == 0) {
			return -1;
		}
		
		int compare = ray[ray.length - 1];
		int output = 0;
		
		for(int i = 0; i < ray.length - 1; i++) {
			if (ray[i] > compare) {
				output = output + ray[i];
			}
		}
		
		if (output == 0) {
			return -1;
		}
		
		return output;
	}
}