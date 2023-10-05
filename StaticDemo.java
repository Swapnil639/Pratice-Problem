package com.bridgelabz;

/*
       1. Start
       2. Declare a class, let's call it "StaticDemo"
       3. Declare a static variable inside the class
       4. Declare a static block inside the class
           - In the static block, initialize the static variable
       5. Declare a static method inside the class
           - The method can access and modify the static variable
       6. Create an instance of the class in the main method
       7. Access the static variable and static method using the class name
       8. End
 */

public class StaticDemo {
    static int staticVariable;

    static {
        staticVariable = 10;
        System.out.println("Static block executed. Static variable value: " + staticVariable);
    }

    static void staticMethod() {
        System.out.println("Static method called. Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable: " + StaticDemo.staticVariable);
        StaticDemo.staticMethod();
    }
}
