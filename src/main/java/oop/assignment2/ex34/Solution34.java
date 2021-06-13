/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex34;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] employees = {"John Smith","Jackie Jackson","Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        int len = employees.length;
        String[] newEmployee = new String[len-1];
        System.out.println("There are " + len + " employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("Enter an employee name to remove:");
        String theRemove = scanner.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(theRemove)) {
                employees[i] = null;
                len--;
                break;
            }
        }
        System.out.println("There are " + len + " employees:");
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            } else {
                newEmployee[j] = employees[i];
                System.out.println(newEmployee[j]);
                j++;
            }
        }
    }
}
