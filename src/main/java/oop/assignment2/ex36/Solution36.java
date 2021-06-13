/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex36;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String curNum = scanner.nextLine();
        int theCurNum = Integer.parseInt(curNum);
        int i = 1;
        int theArray[] = new int[100000];
        theArray[0] = theCurNum;
        while (!curNum.equals("done")) {
            System.out.println("Enter a number:");
            curNum = scanner.nextLine();
            if(!curNum.equals("done")) {
                theCurNum = Integer.parseInt(curNum);
                theArray[i] = theCurNum;
                i++;
            }
        }
        System.out.print("Numbers: ");
        double average = 0;
        theCurNum = Integer.parseInt(curNum);
        int max = theArray[0];
        int min = theArray[0];
        double standardDeviation = 0;
        for(int j = 0; j < i; j++)
        {
            if(j == i -1)
            {
                System.out.print(theArray[j]);
            }
            else
            {
                System.out.print(theArray[j] + ", ");
            }
            if(theArray[j] > max)
            {
                max = theArray[j];
            }
            if(theArray[j] < min)
            {
                min = theArray[j];
            }
            average = average + theArray[j];
        }
        average = average/i;
        double total = 0;
        for(int j = 0; j < i;j++)
        {
            total = total + Math.pow((average - theArray[j]), 2);
        }
        standardDeviation = total/i;
        standardDeviation = Math.sqrt(standardDeviation);
        System.out.println("\nThe average is " + average);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", standardDeviation);
    }
}