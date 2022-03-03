//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( ArrayList<String> toys )
	{
		Toy test;
		int mem;
		for (int i = 0; i < toys.size(); i++) {
			test = new Toy(toys.get(i));
			if (getThatToy(toys.get(i)) == null) {
				toyList.add(test);
				test.setCount(test.getCount() + 1);
			} else {
				for (int j = 0; j < toyList.size(); j++) {
					if (toyList.get(j).getName().equals(toys.get(i))) {
						toyList.get(j).setCount(toyList.get(j).getCount() + 1);
					}
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy x : toyList) {
  			if (x.getName().equals(nm)) {
  				return x;
  			}
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int memory = 0;
  		
  		for (int i = 0; i < toyList.size() - 1; i++) {
  			if (toyList.get(i).getCount() > toyList.get(i + 1).getCount()) {
  				memory = i;
  			}
  		}
  		return toyList.get(memory).toString();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> tmp = new ArrayList<Toy>(toyList.size());
  		int memoryOne = 0;
  		int memoryTwo = 0;
  		
  		for (int i = 0; i < toyList.size(); i++) {
  			for (int j = 0; j < toyList.size() - 1; j++) {
  	  			if (toyList.get(j).getCount() > toyList.get(j + 1).getCount() || toyList.get(j).getCount() <= toyList.get(memoryTwo).getCount()) {
  	  				memoryOne = j;
  	  			}
  			}
  			tmp.add(i, toyList.get(memoryOne));
  			memoryTwo = memoryOne;
  		}
  		
  		toyList = tmp;
  	}  
  	  
	public String toString()
	{
		ArrayList<Toy> toyListUnsorted = toyList;
	   return "Toy List :: " + toyListUnsorted.toString() + "\nMost Frequent Toy :: " + getMostFrequentToy();
	}
}