//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   
   public Perfect() {
	   setNumber(0);
   }
   
   public Perfect(int a) {
	   setNumber(a);
   }
   
	//add a set method

   public void setNumber(int b) {
	   number = b;
   }
   
   public boolean isPerfect() {
	   int divSum = 0;
	   for(int i = 1; i < number; i++) {
		   if(number % i == 0) {
			   divSum = divSum + i;
		   }
	   }
	   if (divSum == number) {
		   return true;
	   } else {
		   return false;
	   }
   }

	//add a toString	
	public String toString(){
		if (isPerfect()) {
			return number + " is perfect.";
		} else {
			return number + " is not perfect.";
		}
	}
}