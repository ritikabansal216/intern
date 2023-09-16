package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            // Prompt the user to enter the operator (+, -, *, /)
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double result;

            // Perform the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        return; // Exit the program
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return; // Exit the program
            }

            System.out.println("Result: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            input.close();
        }
    }
}
/*
 * Purpose:
 * 
 * The purpose of this Java calculator program with error handling is to provide
 * a simple command-line calculator that performs basic arithmetic operations
 * while gracefully handling potential issues with user input. Specifically:
 * 
 * User-Friendly Input: It prompts the user to enter two numbers and an operator
 * (+, -, *, /), making it user-friendly and accessible for performing
 * calculations.
 * 
 * Arithmetic Operations: It performs arithmetic operations (addition,
 * subtraction, multiplication, and division) based on the user's input.
 * 
 * Error Handling: It incorporates error handling to deal with potential issues,
 * such as invalid input (non-numeric values), division by zero, and invalid
 * operators.
 * 
 * Informative Error Messages: It displays informative error messages to guide
 * the user in case of invalid input or mathematical errors, ensuring a smoother
 * user experience.
 * 
 * Resource Management: It manages resources efficiently by closing the input
 * scanner properly in a finally block, preventing resource leaks.
 * 
 * In summary, this calculator program aims to provide a practical tool for
 * performing basic calculations while ensuring that user input is validated and
 * potential errors are handled gracefully, enhancing its overall usability and
 * reliability.
 */
/*
 * 
 * 
 * Method Definition: Each method is defined with its parameters and return
 * type. For example, the add method takes two double parameters and returns
 * their sum as a double.
 * 
 * Method Usage: Inside the main method, we call these calculation methods with
 * the appropriate arguments based on the user's operator input. For example,
 * when the user enters '+', we call add(num1, num2) to calculate the sum.
 * 
 * Using methods in this way enhances code modularity and reusability. It also
 * makes the code easier to read and maintain, as each method has a clear
 * purpose and is responsible for a specific task.
 * 
 * 
 * import java.util.Scanner;
 * 
 * public class Calculator {
 * 
 * // Method to add two numbers
 * public static double add(double num1, double num2) {
 * return num1 + num2;
 * }
 * 
 * // Method to subtract two numbers
 * public static double subtract(double num1, double num2) {
 * return num1 - num2;
 * }
 * 
 * // Method to multiply two numbers
 * public static double multiply(double num1, double num2) {
 * return num1 * num2;
 * }
 * 
 * // Method to divide two numbers
 * public static double divide(double num1, double num2) {
 * if (num2 != 0) {
 * return num1 / num2;
 * } else {
 * System.out.println("Error: Division by zero.");
 * return Double.NaN; // Not-a-Number (to indicate an error)
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * try {
 * // Prompt the user to enter the first number
 * System.out.print("Enter the first number: ");
 * double num1 = input.nextDouble();
 * 
 * // Prompt the user to enter the operator (+, -, *, /)
 * System.out.print("Enter an operator (+, -, *, /): ");
 * char operator = input.next().charAt(0);
 * 
 * // Prompt the user to enter the second number
 * System.out.print("Enter the second number: ");
 * double num2 = input.nextDouble();
 * 
 * double result;
 * 
 * // Perform the calculation based on the operator
 * switch (operator) {
 * case '+':
 * result = add(num1, num2);
 * break;
 * case '-':
 * result = subtract(num1, num2);
 * break;
 * case '*':
 * result = multiply(num1, num2);
 * break;
 * case '/':
 * result = divide(num1, num2);
 * break;
 * default:
 * System.out.println("Error: Invalid operator.");
 * return; // Exit the program
 * }
 * 
 * // Display the result of the calculation
 * System.out.println("Result: " + result);
 * } catch (java.util.InputMismatchException e) {
 * // Handle invalid input by displaying an error message
 * System.out.println("Error: Invalid input. Please enter valid numbers.");
 * } finally {
 * // Close the input scanner to release resources
 * input.close();
 * }
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */