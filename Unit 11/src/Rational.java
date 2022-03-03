//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int x, int y) {
		setRational(x, y);
	}

	//write a setRational method
	public void setRational(int x, int y) {
		setNum(x);
		setDen(y);
	
	}

	//write  a set method for numerator and denominator
	public void setNum(int x) {
		num = x;
	}

	public void setDen(int x) {
		den = x;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int numTmp = other.getNum();
		int denTmp = other.getDen();
		int newNum = num * denTmp + numTmp * den;
		int newDen = den * denTmp;
		num = newNum;
		den = newDen;
		


		reduce();
	}

	private void reduce()
	{
		boolean check = true;
		int tmpNum = num;
		int tmpDen = den;
		do {
			if (den % num == 0 || num == 1) {
				check = false;
			}
			num = tmpNum / gcd(tmpNum, tmpDen);
			den = tmpDen / gcd(tmpNum, tmpDen);
		} while (check == true);
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i = 1; i <= numOne && i <= numTwo; i++) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational test = new Rational(num, den);
		return test;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}

	public int getDen() {
		return num;
	}
	
	public boolean equals( Object obj)
	{
		Rational test = new Rational (num, den);
		Rational newObj = (Rational)obj;
		if (test.getNum() == newObj.getNum() && test.getDen() == newObj.getDen()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Rational other)
	{
		int numTmp = other.getNum();
		int denTmp = other.getDen();
		if (num/den > numTmp/denTmp) {
			return 1;
		} else {
			return -1;
		}
	}



	
	//write  toString() method
	public String toString() {
		return num + " / " + den;
	}
	
}