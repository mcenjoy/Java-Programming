/*
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and remaining days for
 * the minutes. For simplicity, assume that a year has 365 days.
 *
 * Here is a sample run:
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */
package chapter02;

import java.util.Scanner;

public class Ex2_07_Find_the_number_of_years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int totalDays = minutes / 60 / 24;
        int totalYears = totalDays / 365;
        int remainDays = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " +
                totalYears + " years and " + remainDays + " days");
    }
}
