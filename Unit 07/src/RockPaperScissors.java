//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner = "";
		double random = Math.random() * 3;
		int randomInt = (int) random;
		
		if (randomInt == 0) {
			compChoice = "R";
			if (playChoice.equals("S")) {
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			} else {
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
		} else if (randomInt == 1) {
			compChoice = "P";
			if (playChoice.equals("R")) {
				winner = "!Computer wins <<Paper Covers Rock>>!";
			} else {
				winner = "!Player wins <<Scissor Cuts Paper>>!";
			}
		} else if (randomInt == 2) {
			compChoice = "S";
			if (playChoice.equals("P")) {
				winner = "!Computer wins <<Scissor Cuts Paper>>!";
			} else {
				winner = "!Player wins <<Rock Breaks Scissors>>!";
			} 
		}

		if (playChoice.equals(compChoice)) {
			winner = "!Draw Game!";
		}
		
		return winner;
	}

	public String toString()
	{
		String output = "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();	
		return output;
	}
}