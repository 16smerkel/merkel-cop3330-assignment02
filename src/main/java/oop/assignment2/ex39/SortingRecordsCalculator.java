/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment2.ex39;

import java.util.Scanner;

public class SortingRecordsCalculator {
    public static String sortRecords()
    {
        int count;
        Member temp;
        Member firstEmployee = new Member("John","Johnson","Manager","2016-12-31");
        Member secEmployee = new Member("Tou","Xiong","Software Engineer","2016-10-05");
        Member thirdEmployee = new Member("Michaela","Michaelson","District Manager","2015-12-19");
        Member fourthEmployee = new Member("Jake","Jacobson","Programmer","");
        Member fifthEmployee = new Member("Jacquelyn","Jackson","DBA","");
        Member sixEmployee = new Member("Sally","Webber","Web Developer","2015-12-18");
        Member theEmployees[ ]= new Member[6];
        theEmployees[0] = (firstEmployee);
        theEmployees[1] = (secEmployee);
        theEmployees[2] = (thirdEmployee);
        theEmployees[3] = (fourthEmployee);
        theEmployees[4] = (fifthEmployee);
        theEmployees[5] = (sixEmployee);
        for (int i = 0; i < theEmployees.length; i++)
        {
            for (int j = i + 1; j < theEmployees.length; j++)
            {
                if (theEmployees[i].lastName.compareTo(theEmployees[j].lastName) > 0)
                {
                    temp = theEmployees[i];
                    theEmployees[i] = theEmployees[j];
                    theEmployees[j] = temp;
                }
            }
        }
        String thePrint;
        thePrint = ("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (int i = 0; i < theEmployees.length; i++)
        {
            int hyphenCount = 19;
            int hyphenNo = theEmployees[i].firstName.length() + theEmployees[i].lastName.length();
            thePrint += ("\n" + theEmployees[i].firstName + " " + theEmployees[i].lastName);
            for(int j = 0; j < (hyphenCount - hyphenNo); j++)
                thePrint += ("-");
            hyphenCount = 19;
            hyphenNo = theEmployees[i].thePosition.length();
            thePrint += ("|" + theEmployees[i].thePosition);
            for(int j = 0; j < (hyphenCount - hyphenNo); j++)
                thePrint += ("-");
            hyphenCount = 19;
            hyphenNo = theEmployees[i].theDate.length();
            thePrint += ("|" + theEmployees[i].theDate);
            for(int j = 0; j < (hyphenCount - hyphenNo); j++)
                thePrint += ("-");
            thePrint += ("");
        }
        return thePrint;
    }
}
