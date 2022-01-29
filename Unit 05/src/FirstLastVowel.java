//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Choi
//Date - 1 / 27 / 22


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String VowelList = "AEIOUaeiou";
	   if (a.length() == 1) {
		   if(VowelList.indexOf(a) != -1) {
			   return "yes";
		   } else {
			   return "no";
		   }
	   }
	   
	   String first = a.substring(0, 1);
	   String last = a.substring(a.length() - 1);
	   if (VowelList.indexOf(first) != -1 || VowelList.indexOf(last) != -1) {
		   return "yes";
	   } else {
		   return "no";
	   }
	}
}