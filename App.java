package com.example;

/**
 * Main Application Entry Point
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=== Java CI/CD Demo Application ===");
        
        Calculator calc = new Calculator();
        
        System.out.println("Addition (5 + 3) = " + calc.add(5, 3));
        System.out.println("Subtraction (10 - 4) = " + calc.subtract(10, 4));
        System.out.println("Multiplication (6 * 7) = " + calc.multiply(6, 7));
        System.out.println("Division (20 / 4) = " + calc.divide(20, 4));
        
        System.out.println("=== Build Successful! ===");
    }
}
