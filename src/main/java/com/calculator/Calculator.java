package com.calculator;

import java.util.Scanner;

public class Calculator {
    
    // Square root function
    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(x);
    }
    
    // Factorial function
    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (x == 0 || x == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
    
    // Natural logarithm function
    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers");
        }
        return Math.log(x);
    }
    
    // Power function
    public double power(double x, double b) {
        return Math.pow(x, b);
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=================================");
        System.out.println("  Scientific Calculator");
        System.out.println("=================================");
        
        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            try {
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        double sqrtInput = scanner.nextDouble();
                        double sqrtResult = calc.squareRoot(sqrtInput);
                        System.out.println("Result: √" + sqrtInput + " = " + sqrtResult);
                        break;
                        
                    case 2:
                        System.out.print("Enter a number: ");
                        int factInput = scanner.nextInt();
                        long factResult = calc.factorial(factInput);
                        System.out.println("Result: " + factInput + "! = " + factResult);
                        break;
                        
                    case 3:
                        System.out.print("Enter a number: ");
                        double lnInput = scanner.nextDouble();
                        double lnResult = calc.naturalLog(lnInput);
                        System.out.println("Result: ln(" + lnInput + ") = " + lnResult);
                        break;
                        
                    case 4:
                        System.out.print("Enter base (x): ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent (b): ");
                        double exponent = scanner.nextDouble();
                        double powerResult = calc.power(base, exponent);
                        System.out.println("Result: " + base + "^" + exponent + " = " + powerResult);
                        break;
                        
                    case 5:
                        System.out.println("Thank you for using Scientific Calculator!");
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        scanner.close();
    }
}
