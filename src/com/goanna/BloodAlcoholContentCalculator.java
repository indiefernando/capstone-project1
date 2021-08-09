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

        System.out.println("Your current Blood Alcohol Content is at: ");
        double bloodAlcoholContent = ((10 * standardDrinks) - (7.5 * hoursDrinking)) / (6.8 * weight);
        System.out.println(bloodAlcoholContent);

        System.out.println("Hours until Blood Alcohol content is back to zero: ");
        double hoursUntilZero = bloodAlcoholContent / 0.015;
        System.out.println(hoursUntilZero);

    } else if (inp.equals("Female")) {
        System.out.println("Weight in kilograms:");

        double weight = scan.nextDouble();

        System.out.println("Amount of standard drinks consumed:");
        double standardDrinks = scan.nextDouble();

        System.out.println("Amount of hours since your first drink:");
        double hoursDrinking = scan.nextDouble();

        System.out.println("Your current Blood Alcohol Content is at: ");
        double bloodAlcoholContent = ((10 * standardDrinks) - (7.5 * hoursDrinking)) / (5.5 * weight);
        System.out.println(bloodAlcoholContent);

        System.out.println("Hours until Blood Alcohol content is back to zero: ");
        double hoursUntilZero = bloodAlcoholContent / 0.015;
        System.out.println(hoursUntilZero);
    }
    }
