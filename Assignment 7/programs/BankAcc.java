/*  Write a java program to create your own exception which creates insufficient fund exception whenever an account holder in the bank wants to withdraw money greater than that he has in his account? */

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw more than the account balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();

            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid numeric value.");
        } finally {
            scanner.close();
        }
    }
}
