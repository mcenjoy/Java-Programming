/*
 * (Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
 * and 30 seconds. Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */
package chapter01;

public class Ex1_10 {
    public static void main(String[] args) {
        System.out.printf("The average speed is %s mph%n",
                (15 / 1.6) / (50.0 / 60 + 30.0 / 60 / 60));
    }
}
