//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi

public class Grid
{
   private String[][] grid;
   private int row = 0;
   private int col = 0;
   private String[] val;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		row = rows;
		col = cols;
		val = vals;
		grid = new String [rows] [cols];
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				grid[i][k] = vals[(int) Math.floor(Math.random() * vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String tmp = vals[0];
		for (int i = 1; i < vals.length - 1; i++) {
			if (countVals(tmp) > countVals(vals[i])) {
				tmp = vals[i];
			}
		}
		return tmp;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				if (grid[i][k].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < col; k++) {
				output = output + grid[i][k] + " ";
			}
			output = output + "\n";
		}
		
		output = output + findMax(val) + " occurs the most.";
		return output;
	}
}