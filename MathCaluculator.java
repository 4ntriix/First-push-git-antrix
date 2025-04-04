package Antrix;

import java.util.Scanner;

 class MathCalculator {

    static Scanner sc = new Scanner(System.in);

    static void add() {
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Sum: " + (a + b));
    }

    static void subtract() {
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Difference: " + (a - b));
    }

    static void multiply() {
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Product: " + (a * b));
    }

    static void divide() {
        System.out.print("Enter the numerator: ");
        double a = sc.nextDouble();
        System.out.print("Enter the denominator: ");
        double b = sc.nextDouble();
        if (b == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            System.out.println("Quotient: " + (a / b));
        }
    }

    static void square() {
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Result: " + Math.pow(base,2));
    }

    static void cube() {
        System.out.print("Enter the number to cube: ");
        double num = sc.nextDouble();
        System.out.println("Cube: " + Math.pow(num, 3));
    }

    public static void main(String[] args) {
        System.out.println("===== BASIC CALCULATOR =====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        if (choice == 1) add();
        else if (choice == 2) subtract();
        else if (choice == 3) multiply();
        else if (choice == 4) divide();
        else if (choice == 5) square();
        else if (choice == 6) cube();
        else System.out.println("Invalid choice!");

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
