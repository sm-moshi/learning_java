/*
For your math class you need a programm to calculate the factorial of a number.
You're given a program which takes a number as input.
*/

import java.util.Scanner;

public class MathClass {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of which the factorial is to calculate:");
        int number = scanner.nextInt();
        scanner.close();

        long fact = 1;
        int i = 1;

        while (i <= number) {
            fact = fact * i;
            i++;
        }

        System.out.print("The factorial of " + number + " is " + fact + "!\n");
    }
}