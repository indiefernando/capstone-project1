package com.goanna;

import java.util.Scanner;

public class BloodAlcoholContentCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Blood Alcohol Content calculator!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender ('Male' or 'Female'): ");
        String input = scan.next();

        extracted(scan, input);

        System.out.println(" ");
        System.out.println("Please note that the legal alcohol limit for learner and provisional license holders is zero. " +
                "The legal limit for full license holders is 0.05.");
    }

    private static void extracted(Scanner scan, String input) {
        if(input.equalsIgnoreCase("Male")){

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

        } else if (input.equalsIgnoreCase("Female")) {

            System.out.println("Weight in kilograms:");
            double weight = scan.nextDouble();

            System.out.println("Amount of standard drinks consumed:");
            double standardDrinks = scan.nextDouble();

            System.out.println("Amount of hours since your first drink:");
            double hoursDrinking = scan.nextDouble();

            System.out.println("Your current Blood Alcohol Content is at: ");
            double bloodAlcoholContent = ((10 * standardDrinks) - (7.5 * hoursDrinking)) / (5.5 * weight);
            System.out.println(bloodAlcoholContent);

            System.out.println(" ");
            System.out.println("Hours until Blood Alcohol content is back to zero: ");
            double hoursUntilZero = bloodAlcoholContent / 0.015;
            System.out.println(hoursUntilZero);

        } else {
            System.out.println("Invalid input for gender. Please enter 'Male' or 'Female'");

        }
    }
}