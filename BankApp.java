package Projects;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

        while (true) {
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our bank system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
/*
 * Simple Bank Account System Documentation
 * Purpose:
 * The purpose of the Simple Bank Account System is to simulate the
 * functionality of a basic bank account. This system allows users to perform
 * essential banking operations such as depositing money into an account,
 * withdrawing money from an account, checking the account balance, and exiting
 * the system.
 * 
 * How to Use the Simple Bank Account System:
 * Initialization:
 * 
 * When you run the program, it initializes a bank account with an account
 * number, account holder name, and an initial balance.
 * In this example, the initial account has an account number "123456," an
 * account holder name "John Doe," and an initial balance of $1000. You can
 * modify these values as needed.
 * User Interface:
 * 
 * The program provides a simple command-line interface for interacting with the
 * bank account.
 * 
 * The following options are available to the user:
 * 
 * 1. Deposit: Allows the user to deposit money into the account. The user needs
 * to enter the deposit amount when prompted.
 * 
 * 2. Withdraw: Allows the user to withdraw money from the account. The user
 * needs to enter the withdrawal amount when prompted.
 * 
 * 3. Check Balance: Displays the account number, account holder name, and the
 * current balance.
 * 
 * 4. Exit: Exits the bank system.
 * 
 * Usage:
 * 
 * To use the system, follow these steps:
 * 
 * Run the program in a Java environment.
 * 
 * The program will display a menu with the available options.
 * 
 * Choose an option by entering the corresponding number (1, 2, 3, or 4) and
 * press Enter.
 * 
 * Depending on the chosen option, the program will prompt you for additional
 * input (e.g., deposit or withdrawal amount).
 * 
 * The program will execute the selected operation and provide feedback on the
 * action taken (e.g., "Deposited $50 into account 123456").
 * 
 * You can continue using the system by selecting other options or exit the
 * system by choosing option 4.
 * 
 * Exit:
 * 
 * To exit the system, choose option 4 ("Exit") from the menu.
 * 
 * The program will display a closing message and terminate gracefully.
 */