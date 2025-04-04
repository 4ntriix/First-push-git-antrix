package Antrix;
import java.util.Scanner;
public class SimpleInterestCalc {

    static class Interest {
        double principal, rate, time;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter principal amount: ");
            principal = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            rate = sc.nextDouble();
            System.out.print("Enter time (in years): ");
            time = sc.nextDouble();
        }

        void calculate() {
            double si = (principal * rate * time) / 100;
            System.out.println("Simple Interest is: " + si);
        }
    }

    public static void main(String[] args) {
        Interest i = new Interest();
        i.input();
        i.calculate();
    }
}
