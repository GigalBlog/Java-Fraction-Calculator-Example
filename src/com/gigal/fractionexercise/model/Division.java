package com.gigal.fractionexercise.model;

/*
 * This class models division
 */

import com.gigal.fractionexercise.helper.Messages;

public class Division {

	private Fraction fraction1;
	private Fraction fraction2;
	private Fraction answer;

	// Constructor
	public Division(Fraction fraction1, Fraction fraction2) {
		this.fraction1 = fraction1;
		this.fraction2 = fraction2;
		this.answer = new Fraction();
		Calculate();
	}

	// perform the calculation
	public void Calculate() {
		answer.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
		answer.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
	}

	public void display() {
		// Check for the divide by zero error
		if (fraction2.getNumerator() == 0) {
			System.out.println("Division : Cannot divide by zero!");
			return;
		} else {
			// display the answer
			Messages.displayAnswer("Division", "/", fraction1, fraction2,
					answer);
		}
	}

}
