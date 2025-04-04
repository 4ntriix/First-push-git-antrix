package Antrix;
import java.util.Scanner;
public class BankAccount {
    abstract static class Account {
        String holderName;
        double balance;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter account holder name: ");
            holderName = sc.nextLine();
            System.out.print("Enter initial balance: ");
            balance = sc.nextDouble();
        }

        abstract void deposit(double amount);
        abstract void withdraw(double amount);

        void displayBalance() {
            System.out.println("Account Holder: " + holderName);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    static class SavingAccount extends Account {

        @Override
        void deposit(double amount) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        }

        @Override
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        sa.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        sa.withdraw(sc.nextDouble());

        sa.displayBalance();
        sc.close();
    }
}
