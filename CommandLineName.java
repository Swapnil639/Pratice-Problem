package com.bridgelabz;

public class CommandLineName {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            if (isInteger(arg)) {
                int num = Integer.parseInt(arg);
                sum += num;
            } else {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Count of invalid arguments: " + invalidCount);
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
