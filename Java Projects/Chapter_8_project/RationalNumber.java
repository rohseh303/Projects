public class RationalNumber {
	int num = 0;
	int den = 1;
	int val = 0;
	public RationalNumber(int numerator, int denominator) {
		num = numerator;
		den = denominator;
		if(den == 0) {
			System.err.println("Denominator cannot be 0");
			throw new IllegalArgumentException();
		}
		else {
			val = num/den;
		}
	}
	public RationalNumber() {
		val = num/den;
	}
	public int getDenominator() {
		return den;
	}
	public int getNumerator() {
		return num;
	}
	public String toString() {
		String snum = String.valueOf(num);
		String sden = String.valueOf(den);
		return (num+"/"+den);
	}
}