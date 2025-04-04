package Antrix;
import java.util.Scanner;

public class LoanChecker {

    interface Loan {
        void checkEligibility();
    }

    static class PersonalLoan implements Loan {
        public void checkEligibility() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your monthly income: ₹");
            double income = sc.nextDouble();
            System.out.print("Enter your credit score: ");
            int score = sc.nextInt();

            if (income >= 25000 && score >= 700) {
                System.out.println("You are eligible for a personal loan.");
            } else {
                System.out.println("Sorry, you are not eligible for a personal loan.");
            }
        }
    }

    public static void main(String[] args) {
        Loan loan = new PersonalLoan();
        loan.checkEligibility();
    }
}
