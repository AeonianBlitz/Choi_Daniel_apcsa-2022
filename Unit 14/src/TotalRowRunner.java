//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here
		int [] [] m = {{1,2,3},{5,5,5,5}};
		int [] [] n = {{1,2,3},{5},{1},{2,2}};
		int [] [] o = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		TotalRow test = new TotalRow();
		
		System.out.println("Row totals are :: " + test.getRowTotals(m));
		System.out.println("Row totals are :: " + test.getRowTotals(n));
		System.out.println("Row totals are :: " + test.getRowTotals(o));
	}
}


