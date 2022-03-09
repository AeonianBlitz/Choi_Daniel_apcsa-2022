//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1st monster's size : ");
		 int size= keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		 
		Skeleton first = new Skeleton(name,size);
		
		System.out.println("Enter 2nd monster's size : ");
		 int s= keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("Enter 2nd monster's name : ");
		String n = keyboard.next();
		
		Skeleton second = new Skeleton(n,s);
		
		System.out.println("Monster 1 : " + first.toString());
		System.out.println("Monster 2 : " + second.toString());
		
		if (first.isBigger(second)) {
			System.out.println("Monster one is bigger than Monster two.");
		} else {
			System.out.println("Monster one is smaller than Monster two.");			
		}
		
		if (first.namesTheSame(second)) {
			System.out.println("Monster one has the same name as Monster two.");
		} else {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		
		
	}
}