package org.example;

import java.util.Scanner;

public class VariablesDataTypes {
    public static void main(String[] args) {
        /*
        1. Given the total cost of dinner, calculate the tax.
        2. Given a tip percentage to leave to the server, calculate the tip amount based upon the total cost of dinner.
        4. The grand total is calculated by adding the tax and tip to the total cost of dinner.
        3. Given the number of people who ordered, calculate each person's share of the bill using the grand total,
                 split evenly.

        As a bonus feature, given the total number of cookies available on the dessert tray, calculate how many cookies
        each guest may eat.

         */
        Scanner input = new Scanner(System.in);
        double costOfDinner;
        int numberOfGuests;
        int tipPercent;

        System.out.println("******************************");
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("******************************\n");

        System.out.print("Please enter the amount of the bill: ");
        costOfDinner = input.nextDouble();

        // Display tip options
        System.out.println("\n Common tip percentages: ");
        System.out.println("1. 10%");
        System.out.println("2. 15%");
        System.out.println("3. 20%");
        System.out.println("4. Enter a percentage of your choosing");

        // Prompt user for the tip percentage
        System.out.print("Please select 1-3 for a common percentage, or select 4 to enter your own percentage: ");
        int tipOption = input.nextInt();
        double tipPercentage;
        if (tipOption == 1) {
            tipPercentage = 0.1;
        } else if (tipOption == 2) {
            tipPercentage = 0.15;
        } else if (tipOption == 3) {
            tipPercentage = 0.2;
        } else if (tipOption == 4) {
            System.out.print("\nEnter percentage: ");
            tipPercentage = input.nextInt();
        } else {
            System.out.print("Invalid entry. Please select a number in the range of 1-4: ");
        }

        // Calculate and display the tip amount and total cost




    }
}
