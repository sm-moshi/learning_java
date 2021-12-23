import java.util.Scanner;

/*
You need a program to convert days to seconds.
The given code takes the amount of days as input.
Complete the code to convert it to seconds and output the result.
*/

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Please enter an amount of days and the program will convert them to days:");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int seconds;

        seconds = days * 24 * 60 * 60;
    
        System.out.println(days + " days are " + seconds + "!");
    }
}
