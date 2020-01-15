/*
 * (Multiply the digits in an integer) Write a program that reads an integer between
 * 0 and 1000 and multiplies all the digits in the integer. For example, if an integer
 * is 932, the multiplication of all its digits is 54.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The multiplication of all digits in 999 is 729
 */
package chapter02;

import java.util.Scanner;

public class Ex2_06_Sum_the_digits_in_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int initialNumber = input.nextInt();

        int number = initialNumber;
        int multiplication = initialNumber % 10;

        while (number / 10 != 0) {
            number = number / 10;
            multiplication *= number % 10;
        }
        System.out.printf("The multiplication of all digits in %d is %d%n",
                initialNumber, multiplication);
    }
}
