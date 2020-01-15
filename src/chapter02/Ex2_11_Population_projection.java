/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 *
 * Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */
package chapter02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2_11_Population_projection {
    public static void main(String[] args) {

        DecimalFormat nf = new DecimalFormat("#");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        int secondsInYear = 365 * 24 * 60 * 60;
        double birthNumberInYear = secondsInYear / 7.0;
        double deathNumberInYear = secondsInYear / 13.0;
        double immigrantNumberInYear = secondsInYear / 45.0;
        double population = 312032486;

        population = population + (birthNumberInYear - deathNumberInYear + immigrantNumberInYear) * numberOfYears;

        System.out.println("The population in " + numberOfYears + " years is " + nf.format(population));
    }
}
