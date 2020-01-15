/*
 (Financial application: calculate tips) Write a program that reads the subtotal
 and the gratuity rate and then computes the gratuity and total. For example, if the
 user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
 as gratuity and $11.2 as total.
 */
package chapter02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex2_05_Financial_application_calculate_tips {
    public static void main(String[] args) {
        NumberFormat currencyFormatter =
                NumberFormat.getCurrencyInstance(Locale.getDefault());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter a gratuity rate: ");
        double gratuityRate = input.nextDouble() / 100.0;
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + currencyFormatter.format(gratuity) +
                " and total is " + currencyFormatter.format(total));
    }
}