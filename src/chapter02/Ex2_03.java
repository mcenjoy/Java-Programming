/*
(Convert meters into feet) Write a program that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet.
 */
package chapter02;

import java.util.Scanner;

public class Ex2_03 {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meters = scn.nextDouble();

        double feet = meters * 3.2786;
        System.out.println(meters + " meters is " + fmt(feet) + " feet");
    }
    public static String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }
}
