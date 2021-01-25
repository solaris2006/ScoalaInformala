package com.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please enter first number ");
            double num1 = input();
            System.out.println("Please enter second number ");
            double num2 = input();
            System.out.println("Please enter operation (add/subtract/multiply/divide/mod)");
            String operation = stringInput();
            calculate(operation, num1, num2);
            System.out.println("Continue (yes/no) ? ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.println("Exiting...");
                isRunning = false;
            }
        }
    }

    public static void calculate(String operation, double num1, double num2) {
        switch (operation) {
            case "add" -> {
                add(num1, num2);
            }
            case "subtract" -> {
                subtract(num1, num2);
            }
            case "divide" -> {
                divide(num1, num2);
            }
            case "multiply" -> {
                multiply(num1, num2);
            }
            case "mod" -> {
                mod(num1, num2);
            }
            default -> System.out.println("Unknown operation");
        }

    }

    public static double input() {
        double n = 0;
        while (true) {
            Scanner input = new Scanner(System.in);

            try {
                n = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error \nEnter a number");
                input.next();
            }
        }

        return n;
    }

    public static String stringInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        return input;
    }

    public static void add(double num1, double num2) {
        System.out.println("Result " + (num1 + num2));
    }

    public static void multiply(double num1, double num2) {
        System.out.println("Result " + (num1 * num2));
    }

    public static void subtract(double num1, double num2) {
        System.out.println("Result " + (num1 - num2));
    }


    public static void divide(double num1, double num2) {
        double result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");

        }
        System.out.println("Result is " + result);

    }

    public static void mod(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            System.out.println("Modulo is allowed only for positive numbers");
        } else {
            System.out.println("Result" + ((double) (int) num1 % (int) num2));
        }
    }


}
