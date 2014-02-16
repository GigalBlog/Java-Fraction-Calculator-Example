package com.gigal.fractionexercise.app;

/*
 * Fraction Exercise
 * Author - Gigal
 */

import java.util.Scanner;

import com.gigal.fractionexercise.helper.Messages;
import com.gigal.fractionexercise.model.Division;
import com.gigal.fractionexercise.model.Fraction;
import com.gigal.fractionexercise.model.Multiplication;
import com.gigal.fractionexercise.model.Subtraction;
import com.gigal.fractionexercise.model.Addition;

public class FractionsApp {

	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String args[]) {

		Fraction fraction1 = new Fraction(); // first fraction
		Fraction fraction2 = new Fraction(); // second fraction

		// Display application header
		Messages.displayHeader();

		// get user inputs for fraction one and validate them
		do {
			System.out.println("Enter values for fration one");
			Messages.insertNumerator();
			try {
				fraction1.setNumerator(keyboard.nextInt()); // get user input
			} catch (Exception e) {
				Messages.inputError(e); // display error
				return;
			}
			Messages.inputDenominator();
			try {
				fraction1.setDenominator(keyboard.nextInt()); // get user input
			} catch (Exception e) {
				Messages.inputError(e);
				return;
			}
			if (fraction1.getDenominator() == 0) { // check for x/0 error
				Messages.DenominatorCannotBeZero();
			}
		} while (fraction1.getDenominator() == 0);

		// Display fraction one
		System.out.print("Fraction one : ");
		fraction1.display();
		Messages.newLine();

		// get user inputs for fraction two and validate them
		do {
			System.out.println("Enter values for fration two");
			Messages.insertNumerator();
			try {
				fraction2.setNumerator(keyboard.nextInt()); // get user input
			} catch (Exception e) {
				Messages.inputError(e);
				return;
			}
			Messages.inputDenominator();
			try {
				fraction2.setDenominator(keyboard.nextInt()); // get user input
			} catch (Exception e) {
				Messages.inputError(e);
				return;
			}
			if (fraction2.getDenominator() == 0) { // check for x/0 error
				Messages.DenominatorCannotBeZero();
			}
		} while (fraction2.getDenominator() == 0);

		// Display fraction two
		System.out.print("Fraction two : ");
		fraction2.display();
		Messages.newLine();

		// Addition
		Addition addition = new Addition(fraction1, fraction2);
		addition.display();

		// Subtraction
		Subtraction subtraction = new Subtraction(fraction1, fraction2);
		subtraction.display();

		// Multiplication
		Multiplication multiplication = new Multiplication(fraction1, fraction2);
		multiplication.display();

		// Division
		Division division = new Division(fraction1, fraction2);
		division.display();

		// Display application footer
		Messages.displayFooter();
	}

}
