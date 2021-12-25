/*
You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
*/

// I added some features, so the program is more complex and nicer.

import java.util.Scanner;

public class LoanCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of the loan:"); // added
        int amount = scanner.nextInt();

        System.out.println("Please enter how many months into the future you want to calculate:");
        int months = scanner.nextInt();

        System.out.println("Please enter the percentage of your loan:");
        int interest = scanner.nextInt();
        //your code goes here

        scanner.close();
        int payment = 0;
        for (int i = 0; i < months; i++) {
			payment = (amount * interest) / 100;
            amount -= payment;
        }
        System.out.print("After " + months + "you owe him " + amount + "€!");
    }
}
