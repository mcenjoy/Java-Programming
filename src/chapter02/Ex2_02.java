/*
 * (Compute the volume of a triangle) Write a program that reads in the length of
 * sides of an equilateral triangle and computes the area and volume using the following
 * formulas:
 * area = sqrt(3) / 4 *(length of sides)^2
 * volume = area * length
 *
 * Here is a sample run:
 * Enter length of the sides and height of the Equilateral
 */

package chapter02;

import java.util.*;

public class Ex2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double sideLength = input.nextDouble();
        double area = rounder((Math.pow(3, 0.5) / 4) * Math.pow(sideLength, 2));
        double volume = area * sideLength;

        String str = fmt(volume);
        System.out.println("The area is " + fmt(area));
        System.out.println("The volume of the Triangular prism is " + str);
    }

    public static double rounder(double num) {
        return Math.round(num * 10000) / 10000.0;
    }

    public static String fmt(double d) {
        if (d == (long) d)
            return String.format("%.2f", d);
        else
            return String.format("%s", d);
    }
}