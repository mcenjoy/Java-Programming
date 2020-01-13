/*
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 * minutes, and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
package chapter01;

public class Ex1_12 {
    public static void main(String[] args) {
        System.out.printf("The average speed is %s km/h%n", 24 * 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60));
    }
}
