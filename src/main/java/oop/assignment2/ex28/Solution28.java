/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex28;

import java.util.Scanner;
/*
Ask for number -> add number with the total -> repeat |
         <--------------------------------------------|
 */

public class Solution28 {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int theNum = scanner.nextInt();
            intArray[i] = theNum;
        }
        int total = addFiveNum(intArray[0], intArray[1], intArray[2], intArray[3], intArray[4]);
        System.out.println("The total is " + total);
    }

    public static int addFiveNum(int firstOne, int secondTwo, int thirdThree, int fourthFour, int fifthFive)
    {
        int total = 0;
        total = firstOne + secondTwo + thirdThree + fourthFour + fifthFive;
        return total;
    }
}