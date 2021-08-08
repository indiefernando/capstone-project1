package com.goanna;

import java.util.Scanner;

public class BloodAlcoholContentCalculator {

    String male;
    String input = "Male";

    String female;
    String inp = "Female";

    Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender ('Male' or 'Female'): ");
		scan.next();

		if (input.equals("Male")); {

        System.out.println("Weight in kilograms:");

        double weight = scan.nextDouble();

        System.out.println("Amount of standard drinks consumed:");
        double standardDrinks = scan.nextDouble();

        System.out.println("Amount of hours since your first drink:");
        double hoursDrinking = scan.nextDouble();
    }
    }
