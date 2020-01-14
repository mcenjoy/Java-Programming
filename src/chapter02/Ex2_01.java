/*
(Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
    1 mile = 1.6 kilometers
    Enter miles: 96
    96 miles is 153.6 kilometers
*/
package chapter02;

import java.util.Scanner;

public class Ex2_01 {
    public static void main(String [] args) {
        System.out.println("Enter miles: ");
        Scanner scn = new Scanner(System.in);
        double miles = scn.nextDouble();
        double kms = mlsToKms(miles);
        System.out.println(fmt(rounder(miles)) + " miles is " +
                fmt(rounder(kms)) + " kilometres");
    }

    public static double mlsToKms(double miles) {
        return miles * 1.6;
    }

    public static double rounder(double num) {
        return Math.round(num * 1000) / 1000.0;
    }

    public static String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }
}