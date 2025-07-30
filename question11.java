package javaassignment;




public class question11 {

    // Method to add two numbers
    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition of " + a + " and " + b + " = " + result);
    }

    // Method to find the difference between two numbers
    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference of " + a + " and " + b + " = " + result);
    }

    // Method to multiply two numbers
    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " = " + result);
    }

    // Method to divide two numbers
    public void div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division of " + a + " by " + b + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    // Main method to create object and invoke methods
    public static void main(String[] args) {
        question11 calc = new question11();

        double num1 = 10.5;
        double num2 = 2.5;

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}

/*
 * 
 * Addition of 10.5 and 2.5 = 13.0
Difference of 10.5 and 2.5 = 8.0
Multiplication of 10.5 and 2.5 = 26.25
Division of 10.5 by 2.5 = 4.2

*/
