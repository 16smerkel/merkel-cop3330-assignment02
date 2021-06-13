/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex38;

public class EvenNumberDetector {
    public static String showTheEven(String numSpace) {
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String temp = new String();
        int[] unSort = new int[numSpace.length()];
        int j = 0;
        for (int i = 0; i < numSpace.length(); i++) {
            if (numSpace.charAt(i) != ' ')
                temp += numSpace.charAt(i);
            if (numSpace.charAt(i) == ' ') {
                unSort[j] = Integer.parseInt(temp);
                System.out.print(unSort[j] + " ");
                j++;
                temp = "";
            }
            if (i == numSpace.length() - 1) {
                unSort[j] = Integer.parseInt(temp);
                System.out.print(unSort[j] + " ");
                j++;
                temp = "";
            }
        }
        int[] theSort = filterEvenNumbers(unSort);
        String Ans = ("The even numbers are ");
        for (int k = 0; k < theSort.length; k++) {
            Ans += (theSort[k] + " ");
        }
        return Ans;
    }

    public static int[] filterEvenNumbers(int[] unSort) {
        int[] theSort = new int[unSort.length];
        int l = 0;
        for (int k = 0; k < unSort.length; k++) {
            if (unSort[k] % 2 == 0 && unSort[k] != 0) {
                theSort[l] = unSort[k];
                l++;
            }
        }
        int[] theSorted = new int[l];
        for (int k = 0; k < l; k++) {
            theSorted[k] = theSort[k];
        }
        return theSorted;
    }
}
