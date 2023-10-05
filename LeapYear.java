package com.bridgelabz;

/*
 1. Start
       2.Declare variable year.
       2. Read the year from the user
       3. If the year%400==0 or year%100!=0 and year%4==0.
             Print "Year is a leap year"
       4. Else
             Print "Year is not a leap year"
       5. End

 */

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year:");
        int year=Utility.scannerInt();
        if (year%400==0 || year%100!=0 && year%4==0){
            System.out.println(year+" is Leap year");
        }else {
            System.out.println(year+" is not Leap year");
        }
    }
}
