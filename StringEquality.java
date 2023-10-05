package com.bridgelabz;

/*
       1. Start
       2.Declare variable string1,string2.
       2. Read the first string, let's call it "string1"
       3. Read the second string, let's call it "string2"
       4. Compare "string1" and "string2" for equality
           - If they are equal, go to step 5
           - If they are not equal, go to step 6
       5. Print "string1" and "string2" are equal
       6. Print "string1" and "string2" are not equal
       7. End
 */

public class StringEquality {
    public static void main(String[] args) {
        System.out.print("Enter the first string: ");
        String string1 = Utility.scannerString();

        System.out.print("Enter the second string: ");
        String string2 = Utility.scannerString();

        if (string1.equals(string2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
