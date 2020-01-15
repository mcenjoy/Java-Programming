/*
 (Convert square meter into ping) Write a program that converts square meter into ping.
 The program prompts the user to enter a number in square meter, converts it to ping,
 and displays the result. One square meter is 0.3025 ping.
 */
package chapter02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ex2_04_Convert_square_meter_into_ping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("####,###.000", otherSymbols);
        System.out.println("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double pings = squareMeters * 0.3025;
        System.out.println(squareMeters + " square meters is " + df.format(pings) + " pings");
    }
}
