package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        1. Given the total cost of dinner, calculate the tax.
        2. Given a tip percentage to leave to the server, calculate the tip amount based upon the total cost of dinner.
        4. The grand total is calculated by adding the tax and tip to the total cost of dinner.
        3. Given the number of people who ordered, calculate each person's share of the bill using the grand total,
                 split evenly.
         */
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("******************************");
        System.out.println("Welcome to Tip Calculator!");
        System.out.println("******************************");

        // Display tip options
        System.out.println("\nCommon tip percentages: ");
        System.out.println("1. 10%");
        System.out.println("2. 15%");
        System.out.println("3. 20%");
        System.out.println("4. Enter a percentage of your choosing");

        // Prompt user for the tip percentage
        System.out.print("Please select 1-3 for a common percentage, or select 4 to enter your own percentage: ");
        int tipOption = 0;
        double tipPercentage;

        while (tipOption < 1 || tipOption > 4) {
            try {
                tipOption = input.nextInt();
                if (tipOption < 1 || tipOption > 4) {
                    System.out.println("Invalid option selected. Please try again.");
                    System.out.print("Please select 1-3 for a common percentage, or select 4 to enter your own percentage: ");
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.print("Invalid input. Please enter 1, 2, 3, or 4: ");
            }
        }

        if (tipOption == 1) {
            tipPercentage = 0.1;
        } else if (tipOption == 2) {
            tipPercentage = 0.15;
        } else if (tipOption == 3) {
            tipPercentage = 0.2;
        } else {
            System.out.print("Enter your custom percentage: ");
            tipPercentage = input.nextDouble() / 100.0;
        }

        // Calculate and display the tip amount and total cost
        double costOfMeal = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Please enter the amount of the bill: ");
                costOfMeal = input.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print("Invalid input. Please enter a valid amount for the bill: ");
            }
        }

        double tipAmount = costOfMeal * tipPercentage;
        double totalCost = costOfMeal + tipAmount;

        System.out.printf("The tip amount is $%.2f and the total cost is $%.2f.\n\n", tipAmount, totalCost);
        input.nextLine();

        // Prompt user regarding splitting the bill
        boolean validSplitResponse = false;
        while (!validSplitResponse) {
            System.out.print("Would you like to split this bill among your party? (Y/N): ");
            String userInput = input.nextLine().toUpperCase();
            if (!userInput.isEmpty() && Character.toUpperCase(userInput.charAt(0)) == 'Y') {
                int numberOfSplitters = 0;
                boolean validNumberOfSplitters = false;

                while (!validNumberOfSplitters) {
                    try {
                        System.out.print("How many people will be splitting the bill? ");
                        numberOfSplitters = input.nextInt();
                        if (numberOfSplitters > 0) {
                            double splitAmount = totalCost / numberOfSplitters;
                            System.out.printf("To split the bill evenly, each person should contribute $%.2f", splitAmount);
                            validNumberOfSplitters = true;
                        } else {
                            System.out.println("Please enter a positive whole number.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid whole number.");
                        input.nextLine();
                    }
                }
                validSplitResponse = true;
            } else if (!userInput.isEmpty() && Character.toUpperCase(userInput.charAt(0)) == 'N') {
                validSplitResponse = true;
            } else {
                System.out.println("Please enter 'Y' for 'yes' or 'N' for 'no'.");
            }
        }

        // Thank user for using application.
        System.out.println("\n\nThank you for using Tip Calculator. This program will now detonate.");

    }
}
