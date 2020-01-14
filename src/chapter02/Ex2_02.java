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

import java.math.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Ex2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("####,###.00", otherSymbols);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double sideLength = input.nextDouble();
        double area = round((Math.pow(3, 0.5) / 4) * Math.pow(sideLength, 2), 4);
        double volume = area * sideLength;

        System.out.println("The area is " + df.format(area));
        System.out.println("The volume of the Triangular prism is " + df.format(volume));
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}