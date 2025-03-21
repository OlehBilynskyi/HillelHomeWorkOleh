package com.mycompany;

import com.mycompany.Calculator;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 2));
        System.out.println("Multiplication: " + calculator.multiply(3, 4));
        System.out.println("Division: " + calculator.divide(8, 2));
    }
}