package oop.assignment2.ex36;

import java.util.Scanner;

public class StandardCalculator {
    public static String calculateTheStandard(String[] theArray)
    {
        System.out.println("Enter a number:");
        int i = 0;
        String curNum = theArray[i];
        i++;
        int theCurNum = Integer.parseInt(curNum);
        while (!curNum.equals("done")) {
            System.out.println("Enter a number:");
            curNum = theArray[i];
            if(!curNum.equals("done")) {
                theCurNum = Integer.parseInt(curNum);
                i++;
            }
        }
        System.out.print("Numbers: ");
        double average = 0;
        int max = theCurNum;
        int min = theCurNum;
        double standardDeviation = 0;
        for(int j = 0; j < i; j++)
        {
            curNum = theArray[j];
            theCurNum = Integer.parseInt(curNum);
            average = average + theCurNum;
            if(j == i -1)
            {
                System.out.print(theCurNum);
            }
            else
            {
                System.out.print(theCurNum + ", ");
            }
            if(theCurNum > max)
            {
                max = theCurNum;
            }
            if(theCurNum < min)
            {
                min = theCurNum;
            }
        }
        average = average/i;
        double total = 0;
        for(int j = 0; j < i;j++)
        {
            curNum = theArray[j];
            theCurNum = Integer.parseInt(curNum);
            total = total + Math.pow((average - theCurNum), 2);
        }
        standardDeviation = total/i;
        standardDeviation = Math.sqrt(standardDeviation);
        String theStand = String.format("%.2f", standardDeviation);
        String theAns =  ("The average is " + average + " The minimum is " + min + " The maximum is " + max + " The standard deviation is " + theStand);
        return theAns;
    }
}
