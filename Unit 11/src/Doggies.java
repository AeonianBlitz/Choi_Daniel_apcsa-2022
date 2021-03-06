//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot
		//make sure spot is in bounds
		
		Dog test = new Dog(age, name);
		if (spot < pups.length) {
			pups[spot] = test;
		}
			
		
	}

	public String getNameOfOldest()
	{
		int memory = 0;
		
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > pups[memory].getAge()) {
				memory = i;
			}
		}
		
		return pups[memory].getName();
	}

	public String getNameOfYoungest()
	{
		int memory = 0;
		
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < pups[memory].getAge()) {
				memory = i;
			}
		}
		
		return pups[memory].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}