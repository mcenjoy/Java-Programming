/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 * a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration.
 *
 * Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */
package chapter02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_09_Physics_acceleration {
    public static void main(String[] args) {
        Locale loc = Locale.US;
        NumberFormat nf = NumberFormat.getInstance(loc);
        nf.setMaximumFractionDigits(4);
        Scanner input = new Scanner(System.in);
        input.useLocale(loc);
        System.out.print("Enter v0, v1, and t: ");
        double[] arr = new double[3];
        String str = input.nextLine();
        /*
        int counter = 0;
        String reg = "[\\s]";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        while (m.find()) {
            counter++;
        }*/
        String[] parts = str.split("[\\s]");
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Double.parseDouble(parts[i]);
        }
        switch (parts.length - 1) {
            case 1:
                arr[2] = input.nextDouble();
                break;
            case 0:
                arr[1] = input.nextDouble();
                arr[2] = input.nextDouble();
                break;
        }
        System.out.println("The average acceleration is " + nf.format((arr[1] - arr[0]) / arr[2]));
    }
}