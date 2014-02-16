package com.gigal.fractionexercise.model;

/*
 * This class models the fraction
 */

public class Fraction {

	private int Numerator; // x
	private int Denominator; // y

	public int getNumerator() {
		return Numerator;
	}

	public void setNumerator(int Numerator) {
		this.Numerator = Numerator;
	}

	public int getDenominator() {
		return Denominator;
	}

	public void setDenominator(int Denominator) {
		this.Denominator = Denominator;
	}

	// This method is used to display fractions
	// Some kind of processing also
	public void display() {

		// 0/y and x/1 types
		if (Numerator == 0 || Denominator == 1) {
			System.out.print(Numerator);
		}

		// -x/-y and x/-y types
		else {
			if ((Numerator < 0 && Denominator < 0) || (Numerator > 0 && Denominator < 0)) {
				Numerator *= -1;
				Denominator *= -1;
			}

			// x/x type
			if (Numerator == Denominator) {
				System.out.print(Numerator);
				return;
			}

			System.out.print(this.Numerator + "/" + this.Denominator);
		}

	}

}
